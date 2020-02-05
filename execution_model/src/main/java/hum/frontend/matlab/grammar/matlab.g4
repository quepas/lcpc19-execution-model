grammar matlab;

@lexer::members {
    int lastTokenType = 0;
    public void emit(Token token) {
        super.emit(token);
        lastTokenType = token.getType();
    }

    private boolean isTransposeOperator() {
        if (lastTokenType == STRING) return false;
        char ch = (char) _input.LA(-1);
        switch(ch) {
            case ')':
            case '}':
            case ']':
            case '_':
            case '\'':
            case '.':
                return true;
            default:
                return Character.isLetterOrDigit(ch);
        }
    }

}

@parser::members {
    private static boolean isIndexedExpr = false;
}

NEWLINE : '\n';
WS      : [ \r\t]+ -> channel(HIDDEN);

SHELL_COMMAND : {lastTokenType == BANG}? ~[\r\n]+;
BANG          : '!';

// Command-like functions
PRINT   : 'print ' ~[\r\n]* -> skip;
DISPLAY : 'display ' ~[\r\n]* -> skip;

// Comments
SECTION_COMMENT : '%%' (NEWLINE | [ \t] ~[\r\n]*) -> skip;
LINE_COMMENT    : '%' ~'!' ~[\r\n]* -> skip;
BLOCK_COMMENT   : '%{' .*? '%}' -> skip;

// Fragments
fragment NOT_A_NUMBER : 'NaN';
fragment INFINITY : 'inf' | 'Inf';
fragment DIGIT : [0-9];
fragment NON_ZERO_DIGIT : [1-9];
fragment LETTER : [a-zA-Z];
fragment EXPONENT : [eE][+\-]? DIGIT+;
fragment IMAGINARY : (DECIMAL_INTEGER | FLOATING_POINT)[ij];

// MATLAB Data types
DECIMAL_INTEGER
  : DIGIT+ EXPONENT?;

FLOATING_POINT
  : DIGIT+ '.' DIGIT* EXPONENT?
  | '.' DIGIT+ EXPONENT?
  ;

COMPLEX_NUMBER: ((DECIMAL_INTEGER | FLOATING_POINT) [-+])? IMAGINARY;
STRING : { !isTransposeOperator() }? '\'' ('\'\'' | ~['\n])* '\'';

/*
 *  Operator definitions. Token names correspond to built-in MATLAB functions
 *  (e.g. op '^' is equivalent to mpower() function, so its token name is MPOWER).
 *  Tokens for operators are arrange from higher to lower precedence (R2016b).
 *  More info: https://www.mathworks.com/help/matlab/matlab_prog/op-precedence.html
 */

/* 1st group: parentheses */
/* 2nd group */
TRANSPOSE : { isTransposeOperator() }? '.\'';   // Non-conjugate transpose
C_TRANSPOSE : { isTransposeOperator() }? '\'';  // Complex conjugate transpose (negates the imaginary part of complex numbers)
POWER : '.^';       // Element-wise power
M_POWER : '^';      // Matrix power
/* 4th group: { U_PLUS, U_MINUS }; defined in 6th group */
NOT : '~';          // Logical negation
/* 5th group */
TIMES : '.*';       // Element-wise multiplication
R_DIVIDE : './';    // Right array division
L_DIVIDE : '.\\';   // Left array division
M_TIMES : '*';      // Matrix multiplication
MR_DIVIDE : '/';    // Matrix right division; Solve systems of linear equations xA = B for x
ML_DIVIDE : '\\';   // Matrix left division; Solve systems of linear equations Ax = B for x
/* 6th group */
PLUS : '+';         // Addition; also U_PLUS
MINUS : '-';        // Subtraction; also U_MINUS
/* 7th group */
COLON : ':';        // Range op; create vectors; array subscripting
/* 8th group */
LT : '<';           // Less than
LE : '<=';          // Less than or equal to
GT : '>';           // Greater than
GE : '>=';          // Greater than or equal to
EQ : '==';          // Equal to
NE : '~=';          // Not equal to
/* 9-12th groups */
AND : '&';          // Element-wise and
OR : '|';           // Element-wise or
SHORT_AND : '&&';   // Short-circuit and
SHORT_OR : '||';    // Short-circuit or

ELLIPSIS : '...' .*? NEWLINE+ -> skip;

fragment NAME_PART: (LETTER) (LETTER | DIGIT | '_')*;

NAME
    : INFINITY
    | NOT_A_NUMBER // Shouldnt this be movecd to the context part? In the rule?
    | NAME_PART '.' NAME_PART
    | NAME_PART
    ;


m_file
    : body EOF                                        #   scriptFile
    | sep* function_def (sep+ function_def)* sep* EOF # functionFile
    ;

statement
    : 'for' NAME '=' expr_primary body 'end'                                # stmtFor
    | 'parfor' NAME '=' initVal=expr ':' endVal=expr body 'end'
        # stmtParfor
    | 'while' expr_primary NEWLINE? body 'end'                              # stmtWhile
    | if_clause elseif_clause* else_clause? 'end'                           # stmtIf
    | 'switch' expr_primary NEWLINE? case_clause* otherwise_clause? 'end'   # stmtSwitch
    | 'try' body catch_clause? 'end'                                        # stmtTry
    | 'break'                                                               # stmtBreak
    | 'global' NAME+                                                        # stmtGlobal
    | 'persistent' NAME+                                                    # stmtPersistent
    | variable '=' expr_primary                                             # stmtSingleAssignment
    | '[' ((expr_index | '~') (','? (expr_index | '~'))*)? ']' '='
        expr_primary                                                        # stmtMultiAssignment
    | NAME NAME+                                                            # stmtCommand
    | shell_stmt                                                            # stmtShell
    | expr_primary ';'                                                      # stmtSideEffect
    ;

sep : ';' | ',' | NEWLINE;

body
    : (sep* statement (sep+ statement)*)? sep*
    ;

if_clause
    : 'if' expr_primary sep body;

elseif_clause
    : 'elseif' expr_primary sep body;

else_clause
    : 'else' body;

case_clause
    : 'case' expr_primary body;

otherwise_clause
    : 'otherwise' body;

catch_clause
    : 'catch' NAME? body;

shell_stmt
    : BANG SHELL_COMMAND
    | BANG
    ;

numeric
  : COMPLEX_NUMBER
  | DECIMAL_INTEGER
  | FLOATING_POINT
  ;

/*
 *  Matrix literal can match to: []; [,]; [1,]; [,1]; [1 2 3]; [1, 2 3]; and so on.
 */
matrix
    : '[' ','? row? ((';' | NEWLINE) row?)* ']';

/*
 *  Cell literal will match to content exactly like from matrix literal.
 */
cell_array
    : '{' ','? row? ((';' | NEWLINE) row?)* '}';

/*
 *  Sequence of expressions separated by whitespaces or comma.
 *  It has an optional comma at the beginning and/or at the end of the sequence.
 */
row
    : ','? expr_primary (','? expr_primary)* ','?;

expr
    : '(' expr ')'                                                  # exprInParentheses
    | <assoc=right> expr op=(TRANSPOSE | C_TRANSPOSE)               # exprTranspose
    | left=expr op=(POWER | M_POWER) right=expr                     # exprPower
    | op=(MINUS | PLUS | NOT) expr                                  # exprUnary
    | left=expr op=(TIMES | R_DIVIDE | L_DIVIDE |
                    M_TIMES | MR_DIVIDE | ML_DIVIDE) right=expr     # exprMatrixOp
    | left=expr op=(PLUS | MINUS) right=expr                        # exprArithmetic
    | left=expr (COLON middle=expr)? COLON right=expr               # exprColon
    | left=expr op=(LT | LE | GT | GE | EQ | NE) right=expr         # exprComparison
    | left=expr AND right=expr                                      # exprAnd
    | left=expr OR right=expr                                       # exprOr
    | left=expr SHORT_AND right=expr                                # exprShortAnd
    | left=expr SHORT_OR right=expr                                 # exprShortOr
    | matrix                                                        # exprMatrix
    | numeric                                                       # exprNumeric
    | cell_array                                                    # exprCell
    | STRING                                                        # exprString
    | '@' inputs expr_primary                                       # exprLambda
    | '@' NAME                                                      # exprHandle
    | NAME ('(' expr_index_list? ')')?                              # exprArrayReadRefOrFunCall
    | NAME ('{' expr_index_list '}')                                # exprCellReadRef
    | { isIndexedExpr }? COLON                                      # exprIndexAll   // In indexed expr sign ':' means "index all"
    | { isIndexedExpr }? 'end'                                      # exprIndexEnd   // In indexed expr 'end' means "index of last element" or length(data)
    ;

variable
    : NAME ('(' expr_index_list ')')   #    arrayWriteRef
    | NAME ('{' expr_index_list '}')   #     cellWriteRef
    | NAME                             #      anyWriteRef
    ;

expr_primary
    : { isIndexedExpr = false; } expr
    ;

expr_index
    : { isIndexedExpr = true; } expr
    ;

/*
 * One or more indexing expressions in a form of the comma separated list.
 */
expr_index_list
    : expr_index (',' expr_index)*
    ;

/*
 * Function definition
 */
function_def
    : 'function' outputs? NAME inputs? body 'end'?
    ;

outputs
    : NAME '='
    | '[' name_list? ']' '='
    ;

name_list
    : NAME (','? NAME)*
    ;

inputs
    : '(' parameter_list? ')'
    ;

parameter_list
    : (NAME | '~') (',' (NAME | '~'))*
    ;
