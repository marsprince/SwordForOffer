package Problem42;

public class ReverseSentence {
	/*
	 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变
	 */
	public void reverseSentence(String sentence)
	{
		if(sentence==null)
			return ;
		String sentenceReverse=reverse(sentence);
		String[] splitStrings=sentenceReverse.split(" ");
		String resultBuffer="";
		for(String s:splitStrings)
			resultBuffer=resultBuffer+reverse(s)+" ";
		System.out.println(resultBuffer);
	}
	/*
	 * 实现字符串左旋，abcdefg和数字2->cdefgab
	 */
	public void leftRotateString(String sentence,int index)
	{
		if(sentence==null || index>sentence.length() || index<0)
			return ;
		String sentenceReverse=reverse(sentence);
		String[] splitStrings={sentenceReverse.substring(0,sentence.length()-index),
				sentenceReverse.substring(sentence.length()-index,sentence.length())};
		String resultBuffer="";
		for(String s:splitStrings)
			resultBuffer=resultBuffer+reverse(s);
		System.out.println(resultBuffer);
	}
	public String reverse(String str)
	{
		char[] array=str.toCharArray();
		for(int i=0;i<(array.length+1)/2;i++)
		{
			char temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
		return String.valueOf(array);
	}	
}
