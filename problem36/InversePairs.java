package problem36;

public class InversePairs {
	/*
	 * 数组中的两个数字如果前面一个数字大于后面一个数字，则这两个数字组成一个逆序对，输入一个数组，求逆序对的总数
	 */
	public int inversePairs(int[] array)
	{
		if(array==null)
			return 0;
		int[] copy=array.clone();
		return mergeSort(array, copy, 0,array.length-1);
	}
	
	private int mergeSort(int[] array,int[] result,int start,int end)
	{
		if(start==end)
		{
			result[start]=array[start];
			return 0;
		}
		int length=(end-start)/2;
		int left=mergeSort(result, array, start, start+length);
		int right=mergeSort(result, array, start+length+1, end);
		/*
		 * 计算相邻表中逆序对个数
		 */
		int leftIndex=start+length;
		int rightIndex=end;
		int count=0;
		int point=rightIndex;
		while(leftIndex>=start && rightIndex>=start+length+1)
		{
			if(result[leftIndex]>result[rightIndex])
			{
				count+=rightIndex-start-length;
				array[point--]=result[leftIndex--];
			}
			else {
				if(result[leftIndex]<result[rightIndex])
					array[point--]=result[rightIndex--];
				else
				{
					count+=rightIndex-start-length-1;
					array[point--]=result[leftIndex--];
					array[point--]=result[rightIndex--];
				}
			}
		}
		for(int i=leftIndex;i>=start;i--)
			array[point--]=result[i];
		for(int j=rightIndex;j>=start+length+1;j--)
			array[point--]=result[j];
		return left+right+count;	
	}
}
