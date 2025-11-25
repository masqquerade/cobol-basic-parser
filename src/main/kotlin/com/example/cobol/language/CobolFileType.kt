package com.example.cobol.language

import com.intellij.icons.AllIcons
import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CobolFileType : LanguageFileType(CobolLanguage) {
    override fun getName() = "COBOL"
    override fun getDescription() = "COBOL Language File"
    override fun getDefaultExtension() = "cbl"
    override fun getIcon(): Icon {
        return AllIcons.FileTypes.BinaryData
    }
}