package Problem29;

public class MoreThanHalfNum {
	/*
	 * 数组中有一个数字出现的次数超过数组长度的一般，求这个数字
	 */
	public Integer moreThanHalfNum(int[] array)
	{
		if(array==null)
			return null;
		Integer number=null;
		int count=0;
		Integer resultInteger=null;
		for(int i=0;i<array.length;i++)
		{
			if(number==null)
			{
				number=array[i];
				count++;
			}
			else
			{
				if(array[i]!=number)
					if(count==0)
					{
						number=array[i];
						count=1;
					}
					else 
						count--;			
				else
					count++;
			}
			if(count==1)
				resultInteger=number;		
		}
		if(checkMoreThanHalf(array, resultInteger))
			return resultInteger;
		else
			return null;
	}
	private boolean checkMoreThanHalf(int[] array,int number)
	{
		int times=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==number)
				times++;
		}
		if(times*2<=array.length)
			return false;
		else 
			return true;
			
	}
}
