

grammar LogRead;

      proc: IP Whitespace unaryOperator Whitespace USER Whitespace LSQUARE date RSQUARE Whitespace  STRING Whitespace IP Whitespace IP (Whitespace | EOF)
        ;

      date: DATE Whitespace DATE
         ;

    IP: [0-9.]+;
    USER: [a-zA-Z]+;
    DATE: [a-zA-Z:0-9/-]+;
    STRING
    :  '"' ( Enum | ~('\\'|'"') )* '"'
    ;
    Enum : 'GET' | 'POST';
    unaryOperator
    :   '&' | '*' | '+' | '-' | '~' | '!'
    ;
    LSQUARE : '[' ;
    RSQUARE : ']' ;
    Whitespace : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ /*-> skip */;

