package Problem35;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Problem35test {
	public static void main(String args[])
	{
		LinkedHashMap<String,String> test=new LinkedHashMap<String,String>();
		test.put("1", "first");
		test.put("2", "secodn");
		test.put("3", "third");
		test.put("4", "third");
		test.put("5", "third");
		test.put("6", "third");
		for(String key:test.keySet())
		{
			System.out.println(key);
		}
		//FirstNotRepeating test=new FirstNotRepeating();
		//System.out.println(test.firstNotRepeating("abaccdeff"));
	}

}
