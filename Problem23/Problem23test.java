package Problem23;

import Problem5.printListReversversingly;

public class Problem23test {
	public static void main(String args[])
	{
		BinaryTreeNode<Integer> root1=new BinaryTreeNode();
		BinaryTreeNode<Integer> node1=new BinaryTreeNode();
		BinaryTreeNode<Integer> node2=new BinaryTreeNode();
		BinaryTreeNode<Integer> node3=new BinaryTreeNode();
		BinaryTreeNode<Integer> node4=new BinaryTreeNode();
		BinaryTreeNode<Integer> node5=new BinaryTreeNode();
		BinaryTreeNode<Integer> node6=new BinaryTreeNode();
		root1.leftNode=node1;
		root1.rightNode=node2;
		node1.leftNode=node3;
		node1.rightNode=node4;
		node4.leftNode=node5;
		node4.rightNode=node6;
		root1.data=8;
		node1.data=8;
		node2.data=7;
		node3.data=9;
		node4.data=2;
		node5.data=4;
		node6.data=7;
		PrintFromTopToBottom<Integer> test=new PrintFromTopToBottom<Integer>();
		test.printFromTopToBottom(root1);
	}
}
