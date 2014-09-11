package Problem17;

public class Problem17test {
	public static void main(String args[])
	{
		ListNode head1=new ListNode();
		ListNode second1=new ListNode();
		ListNode head2=new ListNode();
		ListNode second2=new ListNode();
		ListNode third2=new ListNode();
		head1.nextNode=second1;	
		head2.nextNode=second2;
		second2.nextNode=third2;
		head1.data=1;
		second1.data=3;
		head2.data=2;
		second2.data=2;
		third2.data=2;
		
		Merge test=new Merge();
		ListNode result=test.merge(head1,head2);
		System.out.println(result.nextNode.nextNode.nextNode.nextNode.data);
		
		
	}

}
