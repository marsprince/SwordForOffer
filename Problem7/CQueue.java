package Problem7;

import java.util.Stack;

/**
 * Created by liujia on 14-8-26.
 */
public class CQueue {
	/*
	用两个栈实现一个队列，完成两个函数appendTail和deletedHead，分别是在队列尾部插入节点和
	在队列头部删除节点的功能
	 */
	private Stack<String> stack1=new Stack<String>();
	private Stack<String> stack2=new Stack<String>();
	public void appendTail(String s)//改泛型
	{
		stack1.push(s);
	}
	public String deleteHead() throws Exception
	{
		if(stack2.isEmpty())
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		if(stack2.isEmpty())
		{
			throw new Exception("队列为空，不能删除");
		}
		return stack2.pop();
	}

}
