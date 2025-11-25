// This is a generated file. Not intended for manual editing.
package com.example.cobol.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.example.cobol.language.psi.CobolTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.example.cobol.language.psi.*;

public class CobolIdentificationDivisionImpl extends ASTWrapperPsiElement implements CobolIdentificationDivision {

  public CobolIdentificationDivisionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull CobolVisitor visitor) {
    visitor.visitIdentificationDivision(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof CobolVisitor) accept((CobolVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public CobolProgramIdSrc getProgramIdSrc() {
    return findNotNullChildByClass(CobolProgramIdSrc.class);
  }

}
