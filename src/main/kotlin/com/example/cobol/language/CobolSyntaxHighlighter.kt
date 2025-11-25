package com.example.cobol.language

import com.example.cobol.language.psi.CobolTypes
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.psi.TokenType

class CobolSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer {
        return CobolLexAdapter()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> {
        return when (tokenType) {
            // Keywords
            CobolTypes.IDENTIFICATION, CobolTypes.DIVISION, CobolTypes.PROGRAM_ID,
            CobolTypes.DATA, CobolTypes.WORKING_STORAGE, CobolTypes.SECTION,
            CobolTypes.PIC, CobolTypes.VALUE, CobolTypes.PROCEDURE,
            CobolTypes.PERFORM, CobolTypes.VARYING, CobolTypes.FROM,
            CobolTypes.BY, CobolTypes.UNTIL, CobolTypes.STOP,
            CobolTypes.RUN, CobolTypes.DISPLAY -> KEYWORD_KEYS

            // Literals
            CobolTypes.STRING -> STRING_KEYS
            CobolTypes.NUMBER, CobolTypes.LINE_NUMBER, CobolTypes.PICTURE_STRING -> NUMBER_KEYS

            // Ids and dots
            CobolTypes.ID -> ID_KEYS
            CobolTypes.DOT -> DOT_KEYS

            // Bad chars
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS

            else -> EMPTY_KEYS
        }
    }

    companion object {
        val KEYWORD = createTextAttributesKey("COBOL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD)
        val STRING = createTextAttributesKey("COBOL_STRING", DefaultLanguageHighlighterColors.STRING)
        val NUMBER = createTextAttributesKey("COBOL_NUMBER", DefaultLanguageHighlighterColors.NUMBER)
        val ID = createTextAttributesKey("COBOL_ID", DefaultLanguageHighlighterColors.FUNCTION_DECLARATION)
        val DOT = createTextAttributesKey("COBOL_DOT", DefaultLanguageHighlighterColors.DOT)
        val BAD_CHARACTER = createTextAttributesKey("COBOL_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        private val KEYWORD_KEYS = arrayOf(KEYWORD)
        private val STRING_KEYS = arrayOf(STRING)
        private val NUMBER_KEYS = arrayOf(NUMBER)
        private val ID_KEYS = arrayOf(ID)
        private val DOT_KEYS = arrayOf(DOT)
        private val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        private val EMPTY_KEYS = emptyArray<TextAttributesKey>()
    }
}