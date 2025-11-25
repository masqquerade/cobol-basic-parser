package com.example.cobol.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.NlsContexts

class CobolColorSettingsPage : ColorSettingsPage {
    override fun getIcon() = CobolFileType.icon

    override fun getHighlighter(): SyntaxHighlighter {
        return CobolSyntaxHighlighter()
    }

    override fun getDemoText(): String {
        return """
            01 IDENTIFICATION DIVISION.
            02 PROGRAM-ID. HELLO.
            03 DATA DIVISION.
            04 WORKING-STORAGE SECTION.
            05 01 WS-A PIC 9(2) VALUE 0.
            06 PROCEDURE DIVISION.
            07 A-PARA.
            08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
            09 STOP RUN.
            10 B-PARA.
            11 DISPLAY 'B-PARA ' WS-A.
            12 DISPLAY 'B-PARA'.
        """.trimIndent()
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): Map<String?, TextAttributesKey?>? {
        return null
    }

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor?> {
        return DESCRIPTORS
    }

    override fun getColorDescriptors(): Array<out ColorDescriptor?> {
        return ColorDescriptor.EMPTY_ARRAY
    }

    override fun getDisplayName(): @NlsContexts.ConfigurableName String {
        return "Cobol"
    }

}

private val DESCRIPTORS = arrayOf(
    AttributesDescriptor("Keyword", CobolSyntaxHighlighter.KEYWORD),
    AttributesDescriptor("String", CobolSyntaxHighlighter.STRING),
    AttributesDescriptor("Number", CobolSyntaxHighlighter.NUMBER),
    AttributesDescriptor("Identifier", CobolSyntaxHighlighter.ID),
    AttributesDescriptor("Dot / Equals", CobolSyntaxHighlighter.DOT),
    AttributesDescriptor("Bad character", CobolSyntaxHighlighter.BAD_CHARACTER)
)