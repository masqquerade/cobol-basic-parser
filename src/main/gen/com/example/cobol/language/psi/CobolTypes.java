// This is a generated file. Not intended for manual editing.
package com.example.cobol.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.example.cobol.language.psi.impl.*;

public interface CobolTypes {

  IElementType CONDITION = new CobolElementType("CONDITION");
  IElementType DATA_DIVISION = new CobolElementType("DATA_DIVISION");
  IElementType DISPLAY_STMT = new CobolElementType("DISPLAY_STMT");
  IElementType IDENTIFICATION_DIVISION = new CobolElementType("IDENTIFICATION_DIVISION");
  IElementType PARAGRAPH = new CobolElementType("PARAGRAPH");
  IElementType PERFORM_VARYING_PHRASE = new CobolElementType("PERFORM_VARYING_PHRASE");
  IElementType PROCEDURE_DIVISION = new CobolElementType("PROCEDURE_DIVISION");
  IElementType PROGRAM_ID_SRC = new CobolElementType("PROGRAM_ID_SRC");
  IElementType RECORD_DESCRIPTION_ENTRY = new CobolElementType("RECORD_DESCRIPTION_ENTRY");
  IElementType SENTENCE = new CobolElementType("SENTENCE");
  IElementType STOP_STMT = new CobolElementType("STOP_STMT");
  IElementType WORKING_STORAGE_SECTION = new CobolElementType("WORKING_STORAGE_SECTION");

  IElementType BY = new CobolTokenType("BY");
  IElementType DATA = new CobolTokenType("DATA");
  IElementType DISPLAY = new CobolTokenType("DISPLAY");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType(".");
  IElementType EQ = new CobolTokenType("=");
  IElementType FROM = new CobolTokenType("FROM");
  IElementType ID = new CobolTokenType("ID");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType LINE_NUMBER = new CobolTokenType("LINE_NUMBER");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PERFORM = new CobolTokenType("PERFORM");
  IElementType PIC = new CobolTokenType("PIC");
  IElementType PICTURE_STRING = new CobolTokenType("PICTURE_STRING");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM-ID");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType STRING = new CobolTokenType("STRING");
  IElementType UNTIL = new CobolTokenType("UNTIL");
  IElementType VALUE = new CobolTokenType("VALUE");
  IElementType VARYING = new CobolTokenType("VARYING");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING-STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == CONDITION) {
        return new CobolConditionImpl(node);
      }
      else if (type == DATA_DIVISION) {
        return new CobolDataDivisionImpl(node);
      }
      else if (type == DISPLAY_STMT) {
        return new CobolDisplayStmtImpl(node);
      }
      else if (type == IDENTIFICATION_DIVISION) {
        return new CobolIdentificationDivisionImpl(node);
      }
      else if (type == PARAGRAPH) {
        return new CobolParagraphImpl(node);
      }
      else if (type == PERFORM_VARYING_PHRASE) {
        return new CobolPerformVaryingPhraseImpl(node);
      }
      else if (type == PROCEDURE_DIVISION) {
        return new CobolProcedureDivisionImpl(node);
      }
      else if (type == PROGRAM_ID_SRC) {
        return new CobolProgramIdSrcImpl(node);
      }
      else if (type == RECORD_DESCRIPTION_ENTRY) {
        return new CobolRecordDescriptionEntryImpl(node);
      }
      else if (type == SENTENCE) {
        return new CobolSentenceImpl(node);
      }
      else if (type == STOP_STMT) {
        return new CobolStopStmtImpl(node);
      }
      else if (type == WORKING_STORAGE_SECTION) {
        return new CobolWorkingStorageSectionImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
