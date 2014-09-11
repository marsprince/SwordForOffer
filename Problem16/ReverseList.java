package Problem16;

public class ReverseList {
	/*
	 * 输入一个链表的头结点，翻转改链表并输出翻转后的头结点
	 */
	public ListNode reverseList(ListNode head)
	{
		if(head==null)
			return null;
		ListNode preListNode=null;
		ListNode nowListNode=head;
		while(nowListNode.nextNode!=null)
		{
			ListNode nextListNode=nowListNode.nextNode;
			nowListNode.nextNode=preListNode;
			preListNode=nowListNode;
			nowListNode=nextListNode;
		}
		return nowListNode;
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
}
