package Problem26;

public class Problem26test {
	public static void main(String args[])
	{
		Clone testClone=new Clone();
		ComplexListNode root=new ComplexListNode();
		ComplexListNode node1=new ComplexListNode();
		ComplexListNode node2=new ComplexListNode();
		ComplexListNode node3=new ComplexListNode();
		ComplexListNode node4=new ComplexListNode();
		root.data=1;
		/*
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		root.data=1;
		node1.data=2;
		node2.data=3;
		node3.data=4;
		node4.data=5;
		root.sibling=node1;
		node1.sibling=root;
		node3.sibling=node1;
		*/
		ComplexListNode result=testClone.clone(root);
		System.out.println(result.data);
	}

}
