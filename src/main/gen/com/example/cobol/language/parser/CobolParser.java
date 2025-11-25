// This is a generated file. Not intended for manual editing.
package com.example.cobol.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.example.cobol.language.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // item_
  static boolean cobolFile(PsiBuilder b, int l) {
    return item_(b, l + 1);
  }

  /* ********************************************************** */
  // ID '=' NUMBER
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, EQ, NUMBER);
    exit_section_(b, m, CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'DATA' 'DIVISION' '.' working_storage_section
  public static boolean data_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, DATA, DIVISION, DOT);
    r = r && working_storage_section(b, l + 1);
    exit_section_(b, m, DATA_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'DISPLAY' (STRING | ID)+ '.'
  public static boolean display_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, DISPLAY);
    r = r && display_stmt_2(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, DISPLAY_STMT, r);
    return r;
  }

  // (STRING | ID)+
  private static boolean display_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = display_stmt_2_0(b, l + 1);
    while (r) {
      int c = current_position_(b);
      if (!display_stmt_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "display_stmt_2", c)) break;
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | ID
  private static boolean display_stmt_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "display_stmt_2_0")) return false;
    boolean r;
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, ID);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'IDENTIFICATION' 'DIVISION' '.' program_id_src
  public static boolean identification_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identification_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, IDENTIFICATION, DIVISION, DOT);
    r = r && program_id_src(b, l + 1);
    exit_section_(b, m, IDENTIFICATION_DIVISION, r);
    return r;
  }

  /* ********************************************************** */
  // identification_division data_division? procedure_division?
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identification_division(b, l + 1);
    r = r && item__1(b, l + 1);
    r = r && item__2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // data_division?
  private static boolean item__1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item__1")) return false;
    data_division(b, l + 1);
    return true;
  }

  // procedure_division?
  private static boolean item__2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item__2")) return false;
    procedure_division(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // LINE_NUMBER ID '.' sentence*
  public static boolean paragraph(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, ID, DOT);
    r = r && paragraph_3(b, l + 1);
    exit_section_(b, m, PARAGRAPH, r);
    return r;
  }

  // sentence*
  private static boolean paragraph_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paragraph_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!sentence(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "paragraph_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'PERFORM' ID 'VARYING' ID 'FROM' NUMBER 'BY' NUMBER 'UNTIL' condition
  public static boolean perform_varying_phrase(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "perform_varying_phrase")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, PERFORM, ID, VARYING, ID, FROM, NUMBER, BY, NUMBER, UNTIL);
    r = r && condition(b, l + 1);
    exit_section_(b, m, PERFORM_VARYING_PHRASE, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'PROCEDURE' 'DIVISION' '.' paragraph*
  public static boolean procedure_division(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, PROCEDURE, DIVISION, DOT);
    r = r && procedure_division_4(b, l + 1);
    exit_section_(b, m, PROCEDURE_DIVISION, r);
    return r;
  }

  // paragraph*
  private static boolean procedure_division_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "procedure_division_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!paragraph(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "procedure_division_4", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // LINE_NUMBER PROGRAM_ID '.' ID '.'
  public static boolean program_id_src(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "program_id_src")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, PROGRAM_ID, DOT, ID, DOT);
    exit_section_(b, m, PROGRAM_ID_SRC, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER NUMBER ID 'PIC' PICTURE_STRING 'VALUE' NUMBER '.'
  public static boolean record_description_entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_description_entry")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, NUMBER, ID, PIC, PICTURE_STRING, VALUE, NUMBER, DOT);
    exit_section_(b, m, RECORD_DESCRIPTION_ENTRY, r);
    return r;
  }

  /* ********************************************************** */
  // perform_varying_phrase | stop_stmt | display_stmt
  public static boolean sentence(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sentence")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = perform_varying_phrase(b, l + 1);
    if (!r) r = stop_stmt(b, l + 1);
    if (!r) r = display_stmt(b, l + 1);
    exit_section_(b, m, SENTENCE, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'STOP' 'RUN' '.'
  public static boolean stop_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stop_stmt")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, STOP, RUN, DOT);
    exit_section_(b, m, STOP_STMT, r);
    return r;
  }

  /* ********************************************************** */
  // LINE_NUMBER 'WORKING-STORAGE' 'SECTION' '.' record_description_entry*
  public static boolean working_storage_section(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section")) return false;
    if (!nextTokenIs(b, LINE_NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LINE_NUMBER, WORKING_STORAGE, SECTION, DOT);
    r = r && working_storage_section_4(b, l + 1);
    exit_section_(b, m, WORKING_STORAGE_SECTION, r);
    return r;
  }

  // record_description_entry*
  private static boolean working_storage_section_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "working_storage_section_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!record_description_entry(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "working_storage_section_4", c)) break;
    }
    return true;
  }

}
