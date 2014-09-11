package Problem5;

import utils.ListNode;

/**
 * Created by liujia on 14-8-26.
 */
public class Problem5test {
	public static void main (String args[])
	{
		ListNode node1=new ListNode();
		ListNode node2=new ListNode();
		ListNode node3=new ListNode();
		node1.data=1;
		node2.data=2;
		node3.data=3;
		node1.next=node2;
		node2.next=node3;
		printListReversversingly test=new printListReversversingly();
		test.printListReverse(node1);
	}

}
