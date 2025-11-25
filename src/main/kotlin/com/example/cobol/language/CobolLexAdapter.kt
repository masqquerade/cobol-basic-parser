package com.example.cobol.language

import com.intellij.lexer.FlexAdapter

class CobolLexAdapter : FlexAdapter(CobolLexer(null)) {}