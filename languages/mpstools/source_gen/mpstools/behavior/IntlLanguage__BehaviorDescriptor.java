package mpstools.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class IntlLanguage__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x3581a114cbea3e7bL, "mpstools.structure.IntlLanguage");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<Void> customDelete_id6cSWq1JoJeE = new SMethodBuilder<Void>(new SJavaCompoundTypeImpl(Void.class)).name("customDelete").modifiers(SModifiersImpl.create(0, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("6cSWq1JoJeE").registry(REGISTRY).build(SMethodBuilder.createJavaParameter(EditorContext.class, ""));

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(customDelete_id6cSWq1JoJeE);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static void customDelete_id6cSWq1JoJeE(@NotNull final SNode __thisNode__, EditorContext editorContext) {
    editorContext.getRepository().getModelAccess().executeCommand(new Runnable() {
      public void run() {
        ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(__thisNode__, MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, "mpstools.structure.Translation"), false, false), MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, 0x144350812ec117a9L, "aliases"))).visitAll(new IVisitor<SNode>() {
          public void visit(SNode it) {
            ListSequence.fromList(SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec117a3L, "keywords"))).visitAll(new IVisitor<SNode>() {
              public void visit(SNode it) {
                if (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179dL, 0x3581a114cbed7a78L, "language")) == __thisNode__) {
                  SNodeOperations.deleteNode(it);
                }
              }
            });
          }
        });
        SNodeOperations.deleteNode(__thisNode__);

      }
    });
  }

  /*package*/ IntlLanguage__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        customDelete_id6cSWq1JoJeE(node, (EditorContext) parameters[0]);
        return null;
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}