package Problem28;

public class Permutation {
	/*
	 * 输入一个字符串，打印出字符串中字符的所有排列
	 */
	public void permutation(String str)
	{
		if(str==null)
			return ;
		char[] output=str.toCharArray();
		int point=0;
		System.out.println(output);		
		char temp1=output[point];
		output[point]=output[++point];
		output[point]=temp1;
		while(!String.valueOf(output).equals(str))
		{
			System.out.println(output);
			if(point==output.length-1)
			{
				char temp=output[point];
				output[point]=output[0];
				output[0]=temp;
				point=0;
			}
			else 
			{
				char temp=output[point];
				output[point]=output[++point];
				output[point]=temp;				
			}
		}
	}
}
