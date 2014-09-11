package Problem25;

import java.util.Stack;

public class FindPath {
	/*
	 * 输入一个二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径
	 */
	public void findPath(BinaryTreeNode root,int k)
	{
		if(root==null)
			return ;
		Stack<Integer> stack=new Stack<Integer>();
		findPath(root,k,stack);
	}
	private void findPath(BinaryTreeNode root,int k,Stack<Integer> path)
	{
		if(root==null)
			return ;
		if(root.leftNode==null && root.rightNode==null)
		{
			if(root.data==k)
			{
				System.out.println("路径开始");
				for(int i:path)
					System.out.println(i);
				System.out.println(root.data);
			}//打印栈
		}		
		else 
		{
			path.push(root.data);
			findPath(root.leftNode,k-root.data,path);
			findPath(root.rightNode,k-root.data,path);
			path.pop();
		}
	}
}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}