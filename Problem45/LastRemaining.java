package Problem45;

import java.util.ArrayList;

public class LastRemaining {
    /*
    0,1...n-1这Ｎ个数字排成一个圆圈，从从数字０开始每次从这个圆圈里删除第Ｍ个数字．
    求这个圈圈里剩下的最后一个数字
     */

	public int lastRemaining (int count,int m) {
		if(count < 1 || m < 1)
		{
			return -1;
		}
		ArrayList<Integer> cirList=new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			cirList.add((int)i);
		}
		while(cirList.size()>1)
		{
			deleteCirlist(cirList, m);
		}
		return cirList.get(0);
	}
	private ArrayList<Integer> deleteCirlist(ArrayList<Integer> list,int m)
	{
		for (int i = 0; i < list.size(); i++) {
			if(i==m-1)
			{
				list.remove(i);
				return list;
			}
			if(i==list.size()-1)
			{
				i=-1;
                m=m-list.size();
			}
		}
		return list;
	}

}
