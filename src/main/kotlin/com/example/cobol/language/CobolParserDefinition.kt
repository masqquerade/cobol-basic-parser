package com.example.cobol.language

import com.example.cobol.language.parser.CobolParser
import com.example.cobol.language.psi.CobolFile
import com.example.cobol.language.psi.CobolTokensSets
import com.example.cobol.language.psi.CobolTypes
import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet

class CobolParserDefinition : ParserDefinition {

    override fun createLexer(project: Project?): Lexer {
        return CobolLexAdapter()
    }

    override fun getWhitespaceTokens(): TokenSet {
        return TokenSet.create(TokenType.WHITE_SPACE)
    }

    override fun getCommentTokens(): TokenSet {
        return CobolTokensSets.COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return CobolTokensSets.STRING_LITERALS
    }

    override fun createParser(project: Project?): CobolParser {
        return CobolParser()
    }

    override fun getFileNodeType(): IFileElementType {
        return FILE
    }

    override fun createFile(fileViewProvider: FileViewProvider): PsiFile {
        return CobolFile(fileViewProvider)
    }

    override fun createElement(node: ASTNode?): PsiElement {
        return CobolTypes.Factory.createElement(node)
    }
}

val FILE = IFileElementType(CobolLanguage)