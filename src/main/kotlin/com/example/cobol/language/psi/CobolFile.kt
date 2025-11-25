package com.example.cobol.language.psi

import com.example.cobol.language.CobolFileType
import com.example.cobol.language.CobolLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class CobolFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, CobolLanguage) {
    override fun getFileType() = CobolFileType
    override fun toString(): String = "CobolFile"
}