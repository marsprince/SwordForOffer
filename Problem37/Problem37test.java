package Problem37;

public class Problem37test {
	public static void main(String args[])
	{
		ListNode head1=new ListNode();
		ListNode second1=new ListNode();
		ListNode third1=new ListNode();
		ListNode forth1=new ListNode();
		ListNode fifth1=new ListNode();
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode third2=new ListNode();
		ListNode forth2=new ListNode();
		head1.nextNode=second1;	
		second1.nextNode=third1;
		third1.nextNode=forth1;
		forth1.nextNode=fifth1;
		head2.nextNode=second2;
		second2.nextNode=forth1;
		third2.nextNode=fifth1;
		head1.data=1;
		second1.data=2;
		third1.data=3;
		forth1.data=6;
		fifth1.data=7;
		head2.data=4;
		second2.data=5;
		third2.data=6;
		forth2.data=7;
		FindFirstCommonCode test=new FindFirstCommonCode();
		System.out.println(test.findFirstCommonNode(head1, head2).data);
	}

}
