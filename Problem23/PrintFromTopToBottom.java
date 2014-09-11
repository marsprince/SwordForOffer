package Problem23;

import java.util.LinkedList;
import java.util.Queue;

public class PrintFromTopToBottom<K> {
	public <E> void printFromTopToBottom(BinaryTreeNode<K> root)
	{
		if(root!=null)
			return ;
		Queue<BinaryTreeNode<K>> queue=new LinkedList<BinaryTreeNode<K>>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode<K> node=queue.poll();
			System.out.println(node.data);
			if(node.leftNode!=null)
				queue.add(node.leftNode);
			if(node.rightNode!=null)
				queue.add(node.rightNode);
		}
	}
}
class BinaryTreeNode <K>
{
	K data;
	BinaryTreeNode<K> leftNode;
	BinaryTreeNode<K> rightNode;
}
