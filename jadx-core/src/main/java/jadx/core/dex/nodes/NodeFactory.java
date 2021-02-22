package jadx.core.dex.nodes;

import jadx.api.JadxArgs;
import jadx.api.plugins.input.data.IClassData;
import jadx.api.plugins.input.data.IFieldData;
import jadx.api.plugins.input.data.IMethodData;

public class NodeFactory {
	public RootNode createRootNode(JadxArgs args) {
		return new RootNode(args, this);
	}

	public ClassNode createClassNode(RootNode root, IClassData cls) {
		return new ClassNode(root, cls, this);
	}

	public ClassNode createClassNode(RootNode root, String name, int accessFlags) {
		return new ClassNode(root, name, accessFlags);
	}

	public MethodNode createMethodNode(ClassNode classNode, IMethodData mthData) {
		return MethodNode.build(classNode, mthData);
	}

	public FieldNode createFieldNode(ClassNode classNode, IFieldData fieldData) {
		return FieldNode.build(classNode, fieldData);
	}

	public FieldNode createBlockNode(ClassNode classNode, IFieldData fieldData) {
		return FieldNode.build(classNode, fieldData);
	}
}
