package com.example.cobol.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.example.cobol.language.psi.CobolTypes;
import com.intellij.psi.TokenType;

%%

%class CobolLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

CRLF=\R
WHITE_SPACE=[\ \n\t\f]

LINE_NUM=[0-9]+
NUMBER=[0-9]+
ID=[a-zA-Z0-9\-]+
STRING='[^']*'
PICTURE_LITERAL=9\([0-9]+\)

%%

<YYINITIAL> {
    ({CRLF}|{WHITE_SPACE})+ { return TokenType.WHITE_SPACE; }
    "IDENTIFICATION"        { return CobolTypes.IDENTIFICATION; }
    "DIVISION"              { return CobolTypes.DIVISION; }
    "PROGRAM-ID"            { return CobolTypes.PROGRAM_ID; }
    "DATA"                  { return CobolTypes.DATA; }
    "WORKING-STORAGE"       { return CobolTypes.WORKING_STORAGE; }
    "SECTION"               { return CobolTypes.SECTION; }
    "PIC"                   { return CobolTypes.PIC; }
    "VALUE"                 { return CobolTypes.VALUE; }
    "PROCEDURE"             { return CobolTypes.PROCEDURE; }
    "PERFORM"               { return CobolTypes.PERFORM; }
    "VARYING"               { return CobolTypes.VARYING; }
    "FROM"                  { return CobolTypes.FROM; }
    "BY"                    { return CobolTypes.BY; }
    "UNTIL"                 { return CobolTypes.UNTIL; }
    "STOP"                  { return CobolTypes.STOP; }
    "RUN"                   { return CobolTypes.RUN; }
    "DISPLAY"               { return CobolTypes.DISPLAY; }

    "."                     { return CobolTypes.DOT; }
    "="                     { return CobolTypes.EQ; }

    ^ {LINE_NUM}            { return CobolTypes.LINE_NUMBER; }
    {PICTURE_LITERAL}       { return CobolTypes.PICTURE_STRING; }
    {NUMBER}                { return CobolTypes.NUMBER; }
    {STRING}                { return CobolTypes.STRING; }
    {ID}                    { return CobolTypes.ID; }
}

[^]                         { return TokenType.BAD_CHARACTER; }
