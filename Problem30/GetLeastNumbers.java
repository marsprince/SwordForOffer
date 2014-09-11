package Problem30;

import java.util.Arrays;

public class GetLeastNumbers {
	/*
	 *输入N个整数，找出其中最小的k个数 
	 *维护一个k个数字的最大堆
	 */
	public void getLeastNumbers(int[] array,int k)
	{
		if(array==null || k<0 || k>array.length)
			return ;
		//根据输入数组前k个数建立最大堆
		//从k+1个数开始与根节点比较
		//大于根节点，舍去
		//小于，取代根节点，重排最大堆
		int[] kArray=Arrays.copyOfRange(array, 0, k);
		buildMaxHeapify(kArray);
		for(int i=k;i<array.length;i++)
		{
			if(array[i]<kArray[0])
			{
				kArray[0]=array[i];
				maxHeapify(kArray, 0);
			}			
		}
		for(int i:kArray)
			System.out.println(i);
	}
	/*
	 * 保持堆的性质
	 */
	private void maxHeapify(int[] array,int i)
	{
		int left=2*i+1;
		int right=left+1;
		int largest=0;
		if(left<array.length && array[left]>array[i])
			largest=left;
		else 
			largest=i;
		if(right<array.length && array[right]>array[largest])
			largest=right;
		if(largest!=i)
		{
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			maxHeapify(array, largest);
		}
	}
	/*
	 * 建堆
	 */
	private void buildMaxHeapify(int[] array)
	{
		for(int i=array.length/2;i>=0;i--)
			maxHeapify(array, i);
	}

}
