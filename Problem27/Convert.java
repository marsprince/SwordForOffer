package Problem27;

public class Convert {
	/*
	 * 将二叉搜索树转换成一个排序的双向链表
	 */
	public BinaryTreeNode convert(BinaryTreeNode root)
	{
		BinaryTreeNode node=null;
		convert(root,node);
		while(node!=null && node.leftNode!=null)
			node=node.leftNode;
		return node;
	}
	public void convert(BinaryTreeNode root,BinaryTreeNode lastNode)
	{
		if(root==null)
			return ;
		BinaryTreeNode current=root;
		if(current.leftNode!=null)
			convert(current.leftNode,lastNode);
		current.leftNode=lastNode;
		if(lastNode!=null)
			lastNode.rightNode=current;
		lastNode=current;
		if(current.rightNode!=null)
			convert(current.rightNode,lastNode);
	}

}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}
