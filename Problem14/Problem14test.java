package Problem14;

public class Problem14test {
	public static void main(String args[])
	{
		int[] array={2};
		Reorder test=new Reorder();
		test.order(array);
		for(int item:array)
			System.out.println(item);	
	}

}
