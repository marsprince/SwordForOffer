package Problem13;

public class Problem13test {
	public static void main(String args[])
	{
	ListNode head=new ListNode();
	ListNode second=new ListNode();
	ListNode third=new ListNode();
	head.nextNode=second;
	second.nextNode=third;
	head.data=1;
	second.data=2;
	third.data=3;
	DeleteNode testDeleteNode=new DeleteNode();
	testDeleteNode.deleteNode(head, third);
	System.out.println(head.nextNode.nextNode);
	}
	

}
