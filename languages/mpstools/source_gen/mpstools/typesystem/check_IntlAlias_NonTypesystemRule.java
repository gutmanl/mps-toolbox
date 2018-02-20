package mpstools.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractNonTypesystemRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.NonTypesystemRule_Runtime;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.typesystem.runtime.IsApplicableStatus;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.errors.messageTargets.MessageTarget;
import jetbrains.mps.errors.messageTargets.NodeMessageTarget;
import jetbrains.mps.errors.IErrorReporter;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class check_IntlAlias_NonTypesystemRule extends AbstractNonTypesystemRule_Runtime implements NonTypesystemRule_Runtime {
  public check_IntlAlias_NonTypesystemRule() {
  }
  public void applyRule(final SNode intlAlias, final TypeCheckingContext typeCheckingContext, IsApplicableStatus status) {
    ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(intlAlias, MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, "mpstools.structure.Translation"), false, false), MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, 0x144350812ec117a9L, "aliases"))).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        if (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec12644L, "conceptToLocalize")) == SLinkOperations.getTarget(intlAlias, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec12644L, "conceptToLocalize")) && it != intlAlias) {
          {
            MessageTarget errorTarget = new NodeMessageTarget();
            IErrorReporter _reporter_2309309498 = typeCheckingContext.reportTypeError(intlAlias, "Duplicate aliases for concept " + SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec12644L, "conceptToLocalize")), "r:db7aaff3-377f-4480-9105-37f0f28032d6(mpstools.typesystem)", "7149730079817085626", null, errorTarget);
          }
        }
      }
    });
  }
  public SAbstractConcept getApplicableConcept() {
    return MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, "mpstools.structure.IntlAlias");
  }
  public IsApplicableStatus isApplicableAndPattern(SNode argument) {
    return new IsApplicableStatus(argument.getConcept().isSubConceptOf(getApplicableConcept()), null);
  }
  public boolean overrides() {
    return false;
  }
}
