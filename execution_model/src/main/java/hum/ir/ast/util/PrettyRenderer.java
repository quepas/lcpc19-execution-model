package hum.ir.ast.util;

import hum.ir.HasPrettyPrint;
import org.stringtemplate.v4.AttributeRenderer;

import java.util.Locale;

public class PrettyRenderer implements AttributeRenderer {

    @Override
    public String toString(Object o, String s, Locale locale) {
        if (o instanceof HasPrettyPrint) {
            return ((HasPrettyPrint) o).toPrettyString();
        }
        return o.toString();
    }
}
