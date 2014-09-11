package Problem15;

public class Problem15test {
	public static void main(String args[])
	{
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		head.nextNode=second;
		second.nextNode=third;
		third.nextNode=forth;
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		FindKthToTail test=new FindKthToTail();
		ListNode resultListNode=test.findKthToTail(head, 5);
		System.out.println(resultListNode);
	}

}
