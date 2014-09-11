package Problem40;

public class FindNumsAppearOnce {
	/*
	 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次，找出这两个只出现了一次的数字
	 */
	public void findNumsAppearOnce(int[] array)
	{
		if(array==null)
			return ;
		int number=0;
		for(int i:array)
			number^=i;
		int index=findFirstBitIs1(number);
		int number1=0,number2=0;
		for(int i:array)
		{
			if(isBit1(i, index))
				number1^=i;
			else
				number2^=i;		
		}
		System.out.println(number1);
		System.out.println(number2);
		
	}
	private int findFirstBitIs1(int number)
	{
		int indexBit=0;
		while((number & 1)==0)
		{
			number=number >> 1;
			++indexBit;
		}
		return indexBit;
	}
	private boolean isBit1(int number,int index)
	{
		number=number >> index;
		return (number & 1)==0;
	}
	

}
