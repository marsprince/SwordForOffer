package Problem11;

/**
 * Created by liujia on 14-8-27.
 */
public class Power {
	/*
	求base的exponent次方，不得使用库函数，不需要考虑大数问题
	 */
	public double power(double base,int exponent) throws Exception
	{
		double result=0.0;
		if(equal(base,0.0) && exponent<0)
		{
			throw new Exception("０的负数次幂无意义");
		}
		if(equal(exponent,0))
		{
			return 1.0;
		}
		if(exponent<0)
		{
			result=powerWithExponent(1.0/base, -exponent);
		}
		else
		{
			result=powerWithExponent(base,exponent);
		}
		return result;

	}
	private double powerWithExponent(double base,int exponent)
	{
		double result=1.0;
		for (int i=1;i<=exponent;i++)
		{
			result=result*base;
		}
		return  result;
	}
	/*
	判断两个double型数据，计算机有误差
	 */
	private boolean equal(double num1,double num2)
	{
		if((num1-num2>-0.0000001)&&num1-num2<0.0000001)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
