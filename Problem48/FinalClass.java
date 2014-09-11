package Problem48;

public class FinalClass {
	/*
	 * 不能被继承的类
	 */
	public static FinalClass getInstance()
	{
		return new FinalClass();
	}
	public static void deleteInstance(FinalClass instance)
	{
		instance=null;
	}
	private FinalClass(){};
	
}
