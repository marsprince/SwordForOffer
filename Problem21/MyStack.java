package Problem21;

public class MyStack<K> {
	/*
	 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的Min函数，在该栈中,min,push.pop的时间复杂度都是O（1）
	 */
	public ListNode<K> head;
	public int length;
	public void push(K item)
	{
		ListNode<K> node=new ListNode<K>();
		node.data=item;
		node.nextNode=head;
		head=node;
		length++;
	}
	public K pop()
	{
		if(head==null)
			return null;
		ListNode<K> temp=head;
		head=head.nextNode;
		length--;
		return temp.data;
		
	}
}
class ListNode<K>
{
	K data;
	ListNode<K> nextNode;
}
