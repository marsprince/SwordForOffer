package Problem5;

import utils.ListNode;

import java.util.Stack;

/**
 * Created by liujia on 14-8-26.
 */
public class printListReversversingly {
	/*
	输入一个链表的头节点，从尾到头反向打印
	 */
	public void printListReverse(ListNode headNode)
	{
		Stack<ListNode> stack=new Stack<ListNode>();
		while(headNode!=null)
		{
			stack.push(headNode);
			headNode=headNode.next;
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop().data);
		}
	}
}
