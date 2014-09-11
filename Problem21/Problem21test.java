package Problem21;

public class Problem21test {
	public static void main(String args[])
	{
		StackWithMin test=new StackWithMin();
		test.push(3);
		test.push(2);
		test.push(1);
		//System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.min());
	}

}
