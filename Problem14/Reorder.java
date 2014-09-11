package Problem14;

public class Reorder {
	/*
	 * 输入一个整数数组，实现一个函数来调整数组中的数字的顺序，使得所有奇数位于数组的前半部分，偶数位于后半部分
	 */
	public void order(int[] array)
	{
		if(array==null)
			return ;
		int j=0;//定义一个整数，记录偶数开始的位置
		for(int i=0;i<array.length;i++)
		{
			if(!isEven(array[i]))
			{
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	private boolean isEven(int n)
	{
		return n%2==0;
	}

}
