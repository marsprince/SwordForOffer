package Problem6;

import utils.BinaryTreeNode;

import java.util.Arrays;

/**
 * Created by liujia on 14-8-26.
 */
public class ConstructCore {
	/*
	输入二叉树的前序遍历和中序遍历结果,重建二叉树并输出头节点
	ex:12473568,47215386
	 */
	public BinaryTreeNode constructCore(int[] preorder,int[] inorder) throws Exception
	{
		boolean isHave =false;
		if(preorder==null || inorder==null)
		{
		   return null;
		}
		if(preorder.length!=inorder.length)
		{
			throw new Exception("长度不一样－非法输入");
		}
		BinaryTreeNode root=new BinaryTreeNode();
		for(int i=0;i<inorder.length;i++)
		{
			if(inorder[i]==preorder[0])
			{
				isHave =true;
				root.value=inorder[i];
				root.leftNode=constructCore(Arrays.copyOfRange(preorder,1,i+1)
						,Arrays.copyOfRange(inorder,0,i));
				root.rightNode=constructCore(Arrays.copyOfRange(preorder,i+1,preorder.length)
						,Arrays.copyOfRange(inorder,i+1,inorder.length));
			}
		}
		if(!isHave)
		{
			throw new Exception("不包含根节点－非法输入");
		}
		return root;
	}
}
