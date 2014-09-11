package Problem39;

public class treePath {
	/*
	 * 1.输入根节点求树的深度
	 */
	public int treePath(BinaryTreeNode root)
	{
		if(root==null)
			return 0;
		int left=treePath(root.lefNode);
		int right=treePath(root.rightNode);
		return left>right?(left+1):(right+1);
	}
	/*
	 * 2.判断二叉树是不是平衡二叉树，如果二叉树任意节点的左右子树深度相差不超过1，就是平衡的
	 */
	public boolean isBalanced(BinaryTreeNode root)
	{
		int depth=0;
		return isBalanced(root,depth);
	}
	public boolean isBalanced(BinaryTreeNode root,int depth)
	{
		if(root==null)
		{
			depth=0;
			return true;
		}
		int left=0,right=0;
		if(isBalanced(root.lefNode, left)&&isBalanced(root.rightNode,right))
		{
			int diff=left-right;
			if(diff<=1 && diff>=-1)
			{
				depth=1+(left>right?left:right);
				return true;
			}
		}
		return false;
	}
}

class BinaryTreeNode
{
	int data;
	BinaryTreeNode lefNode;
	BinaryTreeNode rightNode;
}