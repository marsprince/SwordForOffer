package Problem41;

public class FindNumbersWithSum {
	/*
	 * 问题1：输入一个递增排序的数组和一个数字s.在数组中查找两个数使他们的和为s，如果有多对数字的和等于s，输出一对即可
	 */
	public void findNumbersWithSum(int[] sortedArray, int number)
	{
		if(sortedArray==null)
			return ;
		int pointHead=0;
		int pointEnd=sortedArray.length-1;
		while(pointEnd>pointHead)
		{
			long curSum=sortedArray[pointEnd]+sortedArray[pointHead];
			if(curSum==number)
			{
				System.out.println(sortedArray[pointHead]);
				System.out.println(sortedArray[pointEnd]);
				break;
			}
			else
			{
				if(curSum>number)
					pointEnd--;
				else
					pointHead++;
			}
		}
	}
	/*
	 * 问题2:输入一个整数s，打印出所有和为s的连续正数序列（至少含有两个数）
	 */
	public void findContinuousSequence(int s)
	{
		if(s<4)
			return ;
		int small=1;
		int big=2;
		while(small<(s+1)/2)
		{
			int curSum=0;
			for(int i=small;i<=big;i++)
				curSum+=i;
			if(curSum==s)
			{
				System.out.println("find one");
				for(int i=small;i<=big;i++)
					System.out.println(i);
				small++;
			}
			else
			{
				if(curSum>s)
					small++;
				else
					big++;
			}
		}
	}

}
