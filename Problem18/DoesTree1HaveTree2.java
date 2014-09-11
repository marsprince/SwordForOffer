package Problem18;

public class DoesTree1HaveTree2 {
	/*
	 * 判断二叉树B是不是二叉树A的子树
	 */
	public boolean doesTree1HaveTree2(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root2==null)
			return true;
		else
			if(root1==null)
				return false;
		if(root1.data!=root2.data)
			return false;
		else {
			return doesTree1HaveTree2(root1.leftNode, root2.leftNode) && doesTree1HaveTree2(root1.rightNode, root2.rightNode);
		}
	}
	public boolean hasSubTree(BinaryTreeNode root1,BinaryTreeNode root2)
	{
		if(root2==null)
			return true;
		else
			if(root1==null)
				return false;
		boolean result=false;
		if(root1!=null && root2!=null)
		{
			if(root1.data==root2.data)
				result=doesTree1HaveTree2(root1, root2);
			if(!result)
				return hasSubTree(root1.leftNode, root2) || hasSubTree(root1.rightNode, root2);
		}
		return result;
	}
}

class BinaryTreeNode
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}
