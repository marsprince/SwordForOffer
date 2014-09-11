package Problem16;

public class Problem16test {
	public static void main(String args[])
	{
		ListNode head=new ListNode();
		ListNode second=new ListNode();
		ListNode third=new ListNode();
		ListNode forth=new ListNode();
		//head.nextNode=second;
		//second.nextNode=third;
		//third.nextNode=forth;
		head.data=1;
		second.data=2;
		third.data=3;
		forth.data=4;
		ReverseList test=new ReverseList();
		ListNode resultListNode=test.reverseList(head);
		System.out.println(resultListNode.data);
	}

}
