package Problem9;

/**
 * Created by liujia on 14-8-27.
 */
public class Fibonacci {
	/*
	求一个函数，输入n，求斐波那契数列的第Ｎ项
	 */
	public long fibonacci(int n)
	{
		long result=0;
		long preOne=1;
		long preTwo=0;
		if(n==0)
		{
			return preTwo;
		}
		if(n==1)
		{
			return preOne;
		}
		for(int i=2;i<=n;i++)
		{
			result=preOne+preTwo;
			preTwo=preOne;
			preOne=result;
		}
		return result;
	}
}
