package Problem38;

import java.util.Arrays;

public class GetNumberOfK {
	/*
	 * 统计一个数字在排序数组中出现的次数
	 */
	public int getNumberOfK(int[] arraySorted,int k)
	{
		int result=0;
		if(arraySorted==null)
			return 0;
		if(arraySorted.length==1)
		{
			if(arraySorted[0]==k)
				return 1;
			else
				return 0;
		}
		if(k<arraySorted[arraySorted.length/2])
			result+=getNumberOfK(Arrays.copyOfRange(arraySorted, 0, arraySorted.length/2),k);
		else
			if(k>arraySorted[arraySorted.length/2])
				 result+=getNumberOfK(Arrays.copyOfRange(arraySorted, arraySorted.length/2, arraySorted.length),k);
			else {
				 result+=getCount(arraySorted, arraySorted.length/2);
			}
		return result;
	}
	private int getCount(int[] arraySorted,int index)
	{
		int k=arraySorted[index];
		int result=0;
		for(int i=index;i<arraySorted.length;i++)
		{
			if(arraySorted[i]==k)
				result++;
			else 
				break;
		}
		for(int i=index-1;i>=0;i--)
		{
			if(arraySorted[i]==k)
				result++;
			else 
				break;
		}
		return result;		
	}
}
