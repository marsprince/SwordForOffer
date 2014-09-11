package Problem44;

public class IsContinuous {
	
	public boolean isContinuous(int array[])
	{
		if(array==null || array.length!=5)
			return false;
		int countOf0=(array[0]==0?1:0);
		int dis=0;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]==0)
				countOf0++;
			int t=array[i];
			int j=0;
			for(j=i-1;j>=0;j--)
			{
				if(t!=0 && t==array[j])
					return false;
				else
					if(t>array[j])
						break;
					else
						array[j+1]=array[j];
			}
			array[j+1]=t;
		}
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]!=0)
				dis+=array[i+1]-array[i]-1;
		}
		if(dis<=countOf0)
			return true;
		else 
			return false;	
	}

}
