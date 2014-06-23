/*
 * Copyright 2014 Guidewire Software, Inc.
 */

package gw.spec.testgen.declcontexts.gosuenhancement;

import gw.spec.testgen.AccessModifier;
import gw.spec.testgen.ClassFileGenerator;
import gw.spec.testgen.CodeGenerationContext;
import gw.spec.testgen.Member;
import gw.spec.testgen.TestGenerationContext;
import gw.spec.testgen.UsageContext;
import gw.spec.testgen.evaluationmethods.EvaluationMethod;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: akeefer
 * Date: Oct 29, 2009
 * Time: 10:09:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class EnhancementDeclSubclassUsageContext implements UsageContext {

  private TestGenerationContext _testGenContext;
  public EnhancementDeclSubclassUsageContext(TestGenerationContext testGenContext) {
    _testGenContext = testGenContext;
  }

  @Override
  public String testClassSuffix() {
    return "Subclass";
  }

  public boolean isApplicable(Member member) {
    // TODO - AHK - We may want to expose protected and private members here
    return member.getAccessMod() == AccessModifier.Public || member.getAccessMod() == AccessModifier.Internal;
  }

  @Override
  public String getTargetClassName() {
    return _testGenContext.constants().gosuClassSubclass();
  }

  @Override
  public ClassFileGenerator getTargetClassFileGenerator(CodeGenerationContext codeGenContext, Member member) {
    return codeGenContext.getClassFileGenerator(getTargetClassName());
  }

  @Override
  public List<EvaluationMethod> getEvaluationMethods(Member member) {
    return _testGenContext.getEvaluationMethodGenerator().getDefaultEvaluationMethods(member);
  }
}