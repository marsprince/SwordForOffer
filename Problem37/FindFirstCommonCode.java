package Problem37;

public class FindFirstCommonCode {
	/*
	 * 求两个单向链表的第一个公共节点
	 */
	public ListNode findFirstCommonNode(ListNode root1,ListNode root2)
	{
		int length1=getLength(root1);
		int length2=getLength(root2);
		ListNode pointLongListNode=null;
		ListNode pointShortListNode=null;
		int dif=0;
		if(length1>length2)
		{
			pointLongListNode=root1;
			pointShortListNode=root2;
			dif=length1-length2;
		}
		else {
			pointLongListNode=root2;
			pointShortListNode=root1;
			dif=length2-length1;
		}
		for(int i=0;i<dif;i++)
			pointLongListNode=pointLongListNode.nextNode;
		while(pointLongListNode!=null && pointShortListNode!=null && pointLongListNode!=pointShortListNode)
		{
			pointLongListNode=pointLongListNode.nextNode;
			pointShortListNode=pointShortListNode.nextNode;
		}
		return pointLongListNode;		
	}
	private int getLength(ListNode root)
	{
		int result=0;
		if(root==null)
			return result;
		ListNode point=root;
		while(point!=null)
		{
			point=point.nextNode;
			result++;
		}
		return result;
	}
}
class ListNode
{
	int data;
	ListNode nextNode;
	
	
}
