package Problem21;

public class StackWithMin extends MyStack<Integer>{
	/*
	 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的Min函数，在该栈中,min,push.pop的时间复杂度都是O（1）
	 */
	private MyStack<Integer> minStack=new MyStack<>();
	private MyStack<Integer> dataStack=new MyStack<>();
	
	@Override
	public void push(Integer item)
	{
		dataStack.push(item);
		if(minStack.length==0 || item<=minStack.head.data)
		{
			minStack.push(item);
		}
		else {
			minStack.push(minStack.head.data);
		}
	}

	@Override
	public Integer pop()
	{
		if(dataStack.length==0 || minStack.length==0)
			return null;
		minStack.pop();
		return dataStack.pop();
		
	}
	
	public Integer min()
	{
		if(minStack.length==0)
			return null;
		return minStack.head.data;
	}
}
