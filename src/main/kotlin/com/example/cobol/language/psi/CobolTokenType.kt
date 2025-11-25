package com.example.cobol.language.psi

import com.example.cobol.language.CobolLanguage
import com.intellij.psi.tree.IElementType

class CobolTokenType(debugName: String) : IElementType(debugName, CobolLanguage) {
    override fun toString(): String = "CobolTokenType.${super.toString()}"
}