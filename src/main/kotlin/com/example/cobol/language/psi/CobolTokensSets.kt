package com.example.cobol.language.psi

import com.intellij.psi.tree.TokenSet

object CobolTokensSets {
    val STRING_LITERALS: TokenSet = TokenSet.create(CobolTypes.STRING)
    val COMMENTS: TokenSet = TokenSet.EMPTY
}