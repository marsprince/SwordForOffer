package Problem47;

public class Add {
	/*
	 * 不能加减乘除做加法
	 */
	public int add(int num1,int num2)
	{
		int sum=0,carry=0;
		do {
			sum=num1^num2;
			carry=(num1 & num2) << 1;
			num1=sum;
			num2=carry;	
		} while (num2!=0);
		return num1;
	}
}
