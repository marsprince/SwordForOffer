package Problem15;

public class FindKthToTail {
	/*
	 * 输入一个链表，输出该链表的倒数第K个结点
	 */
	public ListNode findKthToTail(ListNode head,int k)
	{
		if(head==null || k<=0)
			return null;
		ListNode resultListNode=null;
		ListNode poListNode=head;
		for(int i=0;i<k-1;++i)
		{
			if(poListNode.nextNode!=null)
				poListNode=poListNode.nextNode;
			else 
				return null;
		}
		resultListNode=head;
		while(poListNode.nextNode!=null)
		{
			poListNode=poListNode.nextNode;
			resultListNode=resultListNode.nextNode;
		}
		return resultListNode;
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
}