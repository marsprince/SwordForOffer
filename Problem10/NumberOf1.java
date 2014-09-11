package Problem10;

/**
 * Created by liujia on 14-8-27.
 */
public class NumberOf1 {
	/*
	输入一个整数，输出该数二进制表示中的１的个数
	结论：把一个整数减去１再和原整数与，就会把整数最右边一个１变成０
	 */
	public int numberOf1(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=(n-1) & n;
		}
		return count;
	}
}
