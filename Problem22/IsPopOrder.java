package Problem22;

import java.util.Stack;

public class IsPopOrder {
	/*
	 * 输入两个整数序列，第一个序列表示压入顺序，判断第二个序列是否为弹出顺序.假设入栈所有数字均不相等
	 */
	public boolean isPopOrder(int[] line1,int[] line2)
	{
		if(line1==null || line2==null)
			return false;
		int point1=0;
		Stack<Integer> stack=new Stack<Integer>(); 
		for(int i=0;i<line2.length;i++)
		{
			if(!stack.isEmpty() && stack.peek()==line2[i])
			{
				stack.pop();
			}
			else 
			{	
				if(point1==line1.length)
					return false;
				else
				{
					do
						stack.push(line1[point1++]);
					while(stack.peek()!=line2[i] && point1!=line1.length);
					if(stack.peek()==line2[i])
						stack.pop();
					else
						return false;
					}
				 }
		}
		return true;	
	}
}
