package com.example.cobol.language

import com.intellij.lang.Language

object CobolLanguage : Language("COBOL") {
    private fun readResolve(): Any = CobolLanguage
}