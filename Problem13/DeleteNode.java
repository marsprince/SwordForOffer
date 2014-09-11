package Problem13;

public class DeleteNode {
	/*
	 * 给定单向链表的头指针和一个节点，定义一个函数在O(1)时间删除该节点
	 */
	
	public void deleteNode(ListNode head,ListNode deListNode)
	{
		if(deListNode==null || head==null)
			return ;
		if(head==deListNode)
		{
			head=null;
		}
		else {
			
		if(deListNode.nextNode==null)
		{
			ListNode pointListNode=head;
			while(pointListNode.nextNode.nextNode!=null)
			{
				pointListNode=pointListNode.nextNode;
			}
			pointListNode.nextNode=null;
		}
		else
		{
			deListNode.data=deListNode.nextNode.data;
			deListNode.nextNode=deListNode.nextNode.nextNode;
		}
		}
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
}

