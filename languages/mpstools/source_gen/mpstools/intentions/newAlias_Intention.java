package mpstools.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.AbstractIntentionDescriptor;
import jetbrains.mps.openapi.intentions.IntentionFactory;
import java.util.Collection;
import jetbrains.mps.openapi.intentions.IntentionExecutable;
import jetbrains.mps.openapi.intentions.Kind;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import java.util.Collections;
import jetbrains.mps.intentions.AbstractIntentionExecutable;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.openapi.intentions.IntentionDescriptor;

public final class newAlias_Intention extends AbstractIntentionDescriptor implements IntentionFactory {
  private Collection<IntentionExecutable> myCachedExecutable;
  public newAlias_Intention() {
    super(Kind.NORMAL, true, new SNodePointer("r:4814e9df-b95d-4d95-aaf0-26791f9bf941(mpstools.intentions)", "4664674638740333645"));
  }
  @Override
  public String getPresentation() {
    return "newAlias";
  }
  @Override
  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }
  @Override
  public boolean isSurroundWith() {
    return false;
  }
  public Collection<IntentionExecutable> instances(final SNode node, final EditorContext context) {
    if (myCachedExecutable == null) {
      myCachedExecutable = Collections.<IntentionExecutable>singletonList(new newAlias_Intention.IntentionImplementation());
    }
    return myCachedExecutable;
  }
  /*package*/ final class IntentionImplementation extends AbstractIntentionExecutable {
    public IntentionImplementation() {
    }
    @Override
    public String getDescription(final SNode node, final EditorContext editorContext) {
      return "Add New Alias";
    }
    @Override
    public void execute(final SNode node, final EditorContext editorContext) {
      SNodeFactoryOperations.addNewChild(node, MetaAdapterFactory.getContainmentLink(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec117a8L, 0x144350812ec117a9L, "aliases"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x144350812ec1179cL, "mpstools.structure.IntlAlias")));
    }
    @Override
    public IntentionDescriptor getDescriptor() {
      return newAlias_Intention.this;
    }
  }
}
