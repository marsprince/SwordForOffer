package Problem33;

public class PrintMinNumber {
	/*
	 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印出能拼接出的所有数字中的最小的一个
	 */
	public void printMin(int[] array)
	{
		int[] clone=array.clone();
		printMinNumber(clone,0,clone.length-1);
		for(int i:clone)
			System.out.print(i);
	}
	/*
	 * 核心，比较+快排
	 */
	public void printMinNumber(int[] array,int start,int end)
	{
		if(start<end)
		{
			int main_number=array[end]; //main number
			int small_cur=start;
			for (int j=start;j<end;j++)
			{
				if(isSmall(String.valueOf(array[j]),String.valueOf(main_number)))
				{
					int temp=array[j];
					array[j]=array[small_cur];
					array[small_cur]=temp;
					small_cur++;
				}
			}
			array[end]=array[small_cur];
			array[small_cur]=main_number;
			printMinNumber(array,0,small_cur-1);
			printMinNumber(array,small_cur+1,end);
		}	
	}
	private boolean isSmall(String m,String n)
	{
		String left=m+n;
		String right=n+m;
		boolean result=false;
		for(int i=0;i<left.length();i++)
		{
			if(left.charAt(i)<right.charAt(i))
				return true;
			else
				if(left.charAt(i)>right.charAt(i))
					return false;
		}
		return result;
	}
}
