package Problem43;

public class DicesProbability {
	/*
	 * 把n个骰子仍在地上，所有骰子朝上一面的点数之和为s,输入n,打印出s的所有可能出现的概率
	 */
	public void printProbability(int number)
	{
		if(number<1)
			return ;
		int g_maxValue=6;
		int[][] probabilities=new int[2][];
		probabilities[0]=new int[g_maxValue*number+1];
		probabilities[1]=new int[g_maxValue*number+1];
		int flag=0;
		for(int i=1;i<=g_maxValue;i++)
			probabilities[0][i]=1;
		for(int k=2;k<=number;++k)
		{
			for(int i=0;i<k;++i)
				probabilities[1-flag][i]=0;
			for(int i=k;i<=g_maxValue*k;++i)
			{
				probabilities[1-flag][i]=0;
				for(int j=1;j<=i && j<=g_maxValue;++j)
					probabilities[1-flag][i]+=probabilities[flag][i-j];
			}
			flag=1-flag;
		}
		double total=Math.pow(g_maxValue, number);
		for(int i=number;i<=g_maxValue*number;i++)
		{
			double ratio=(double) probabilities[flag][i]/total;
			System.out.println(i);
			System.out.println(ratio);
		}
	}
}
