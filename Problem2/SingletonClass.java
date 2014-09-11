package Problem2;

public class SingletonClass {
	/*
	 * java单例模式
	 */
	private static class SingletonClassInstance 
	{ 
		private static final SingletonClass instance = new SingletonClass(); 
	} 

	public static SingletonClass getInstance() 
	{ 
		return SingletonClassInstance.instance; 
	} 
	private SingletonClass() { } 
}



