package Problem32;

public class NumberOf1Between1AndN {
	/*
	 *输入一个整数n,求从1到n这N个十进制表示中1出现的次数
	 */
	public long CountOne1(long n)
	{
		Long numberLong=n;
		char[] numberChar=numberLong.toString().toCharArray();
		int[] count=new int[numberChar.length];
		int result=0;
		for(int i=0;i<numberChar.length;i++)
		{
			count[i]= Integer.parseInt(String.valueOf(numberChar[i]))+1;
		}
		for(int i=0;i<count.length;i++)
		{
			int temp=1;
			for(int j=0;j<count.length;j++)
			{
				if(i!=j)
					temp*=count[j];
			}
			result+=temp;
		}
		return result;
	}
	public long CountOne2(long n)
	{
		long count = 0;
		long i = 1;
		long current = 0,after = 0,before = 0;
		while((n / i) != 0)
		{           
			current = (n / i) % 10;
			before = n / (i * 10);
			after = n - (n / i) * i;

			if (current > 1)
				count = count + (before + 1) * i;
			else if (current == 0)
				count = count + before * i;
			else if(current == 1)
				count = count + before * i + after + 1;

			i = i * 10;
		}
		return count;
	}

}
