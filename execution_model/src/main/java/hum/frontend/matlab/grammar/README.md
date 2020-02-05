# MATLAB grammar

## About

An ANTLRv4 grammar for MATLAB language (R2016b and others, actually). The
 language
 specification was derived from:

* MATLAB documentation (R2016b)
* Scientific publications:
  * [The Design and Implementation of a Parser and Scanner for the MATLAB Language in the MATCH Compiler, Technical Report](http://www.ece.northwestern.edu/cpdc/pjoisha/MAGICA/CPDC-TR-9909-017.pdf) [Pramod G. Joisha, Abhay Kanhere, Prithviraj Banerjee, U. Nagaraj Shenoy and Alok Choudhary; Northwestern University, September 1999]
* Other tools with MATLAB grammar specification:
  * [McLab-Core](https://github.com/Sable/mclab-core/blob/master/languages/Matlab/src/Matlab.g) by [Sable Research Group](http://www.sable.mcgill.ca/)
  * [GNU Octave](http://hg.savannah.gnu.org/hgweb/octave/file/ce0f54b63923/libinterp/parse-tree/oct-parse.in.yy)
  * [MParser](http://pcc.cs.byu.edu/code/mparser-0.1.tar.gz) by [David Wingate](http://pcc.cs.byu.edu/)

## Supported features

* Expressions
  * Working transpose! (string/transpose madness)
  * Working indexing (*end* keyword and "index all" sign *:*)
  * Working ellipsis (*...*)
* Statements
  * Shell command (_!cmd_)
* Script files
* Function definition
* Class definition

## Known problems

All issues are listed in tickets connected to [Rebuild Parser](https://github.com/quepas/HurryHurryMATLAB/milestone/2) milestone.
