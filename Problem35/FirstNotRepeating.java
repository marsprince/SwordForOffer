package Problem35;

import java.util.LinkedHashMap;

public class FirstNotRepeating {
	/*
	 * 在字符串中找出第一个只出现一个的字符
	 */
	public Character firstNotRepeating(String str)
	{
		if(str==null)
			return null;
		char[] strChar=str.toCharArray();
		LinkedHashMap<Character,Integer> hash=new LinkedHashMap<Character,Integer>();
		for(char item:strChar)
		{
			if(hash.containsKey(item))
				hash.put(item, hash.get(item)+1);
			else
				hash.put(item, 1);
		}
		for(char key:hash.keySet())
		{
			if(hash.get(key)==1)
				return key;
		}
		return null;
		
	}

}
