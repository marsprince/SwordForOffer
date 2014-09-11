package Problem26;

public class Clone {
	/*
	 * 复制一个复杂链表
	 */
	public void cloneNodes(ComplexListNode root)
	{
		ComplexListNode point=root;
		while(point!=null)
		{
			ComplexListNode cloneComplexListNode=new ComplexListNode();
			cloneComplexListNode.next=point.next;
			cloneComplexListNode.data=point.data;
			point.next=cloneComplexListNode;
			point=cloneComplexListNode.next;
		}
	}
	public void connectSiblingNodes(ComplexListNode root)
	{
		ComplexListNode point=root;
		while(point!=null)
		{
			ComplexListNode cloned=point.next;
			if(point.sibling!=null)
				cloned.sibling=point.sibling.next;
			point=cloned.next;
		}
	}
	public ComplexListNode reConnectNodes(ComplexListNode root)
	{
		ComplexListNode point=root.next;
		while(point.next!=null)
		{
			point.next=point.next.next;
			point=point.next;
		}
		return root.next ;
	}
	public ComplexListNode clone(ComplexListNode root)
	{
		cloneNodes(root);
		connectSiblingNodes(root);
		return reConnectNodes(root);
	}
}

class ComplexListNode
{
	int data;
	ComplexListNode next;
	ComplexListNode sibling;
}
