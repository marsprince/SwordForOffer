package Problem6;

import utils.BinaryTreeNode;

/**
 * Created by liujia on 14-8-26.
 */
public class Problem6test {
	public  static void main(String args[]) throws Exception
	{
		ConstructCore test=new ConstructCore();
		int[] pre={1,2,3,4};
		int[] in={5,6,7,1};
		BinaryTreeNode root=test.constructCore(pre,in);
		System.out.println(root);
	}
}
