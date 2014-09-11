package Problem18;

public class Problem18 {
	public static void main(String args[])
	{
		BinaryTreeNode root1=new BinaryTreeNode();
		BinaryTreeNode node1=new BinaryTreeNode();
		BinaryTreeNode node2=new BinaryTreeNode();
		BinaryTreeNode node3=new BinaryTreeNode();
		BinaryTreeNode node4=new BinaryTreeNode();
		BinaryTreeNode node5=new BinaryTreeNode();
		BinaryTreeNode node6=new BinaryTreeNode();
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
		BinaryTreeNode root2=new BinaryTreeNode();
		BinaryTreeNode a=new BinaryTreeNode();
		BinaryTreeNode b=new BinaryTreeNode();
		root2.leftNode=a;
		root2.rightNode=b;
		root2.data=8;
		a.data=7;
		b.data=2;
		DoesTree1HaveTree2 test=new DoesTree1HaveTree2();
		System.out.println(test.hasSubTree(root1, root2));
		
	}
}
