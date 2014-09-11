package Problem24;

import java.util.Arrays;

public class VerifySequerceOfBST {
	/*
	 * 输入一个数组，判断数组是不是二叉搜索树的后序遍历结果
	 */
	public boolean verifySequenceOfBST(int[] array)
	{
		if(array==null || array.length<=0)
			return false;
		int root=array[array.length-1];
		int cut=0;
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]>root)
			{
				cut=i+1;
				break;
			}
		}
		if(cut==0)
			verifySequenceOfBST(Arrays.copyOfRange(array, 0 ,array.length-1));
		else {
			for(int i=cut;i<array.length-1;i++)
			{
				if(array[i]<=root)
					return false;
			}
			verifySequenceOfBST(Arrays.copyOfRange(array, 0 ,cut));
			verifySequenceOfBST(Arrays.copyOfRange(array, cut,array.length-1));
		}
		return true;
	}

}
class BinaryTreeNode 
{
	int data;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
}