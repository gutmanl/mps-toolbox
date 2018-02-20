package mpstools.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

/*package*/ class LocalizeableAlias_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public LocalizeableAlias_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCustom_5a1nd2_a();
  }

  private EditorCell createCustom_5a1nd2_a() {
    AbstractCellProvider provider = new _FunctionTypes._return_P0_E0<AbstractCellProvider>() {
      public AbstractCellProvider invoke() {
        final Wrappers._T<String> aliasTemp = new Wrappers._T<String>(SConceptOperations.conceptAlias(SNodeOperations.getConcept(myNode)));
        Sequence.fromIterable(SLinkOperations.collectMany(SModelOperations.roots(SNodeOperations.getModel(myNode), MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, "mpstools.structure.Translation")), MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, 0x144350812ec117a9L, "aliases"))).visitAll(new IVisitor<SNode>() {
          public void visit(SNode it) {
            if (SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec12644L, "conceptToLocalize")) == SNodeOperations.asNode(SNodeOperations.getConcept(myNode))) {
              aliasTemp.value = SPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, 0x144350812ec117a3L, "keywords"))).findFirst(new IWhereFilter<SNode>() {
                public boolean accept(SNode it) {
                  return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179dL, 0x3581a114cbed7a78L, "language")) == SLinkOperations.getTarget(ListSequence.fromList(SModelOperations.roots(SNodeOperations.getModel(myNode), MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, "mpstools.structure.Translation"))).first(), MetaAdapterFactory.getReferenceLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, 0x77c134f2d5ccc234L, "selectedLanguage"));
                }
              }), MetaAdapterFactory.getProperty(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179dL, 0x144350812ec117a0L, "keyword"));
            }
          }
        });
        final String alias = aliasTemp.value;

        return new AbstractCellProvider() {
          public EditorCell createEditorCell(EditorContext p0) {
            return new EditorCell_Constant(getEditorContext(), myNode, alias);
          }
        };
      }
    }.invoke();
    EditorCell editorCell = provider.createEditorCell(getEditorContext());
    editorCell.setCellId("Custom_5a1nd2_a");
    return editorCell;
  }
}
