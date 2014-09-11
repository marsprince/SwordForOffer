package Problem19;

import java.util.Stack;

public class MirrorRecursively {
	/*
	 * 输入一个二叉树，输出它的镜像
	 */
	public BinaryTreeNode mirrorRecursively(BinaryTreeNode root)
	{
		if(root==null)
			return null;
		BinaryTreeNode node=root;
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		while(node!=null || !stack.isEmpty())
		{
			while(node!=null)
			{
				BinaryTreeNode temp=node.leftNode;//交换左右子节点
				node.leftNode=node.rightNode;
				node.rightNode=temp;
				stack.push(node);
				node=node.leftNode;
			}
			node=stack.pop();
			node=node.rightNode;
		}
		return root;
	}

}
class BinaryTreeNode
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}
