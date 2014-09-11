package Problem3;

/**
 * Created by liujia on 14-8-25.
 */
public class Find {
    /*
    一个二维数组，每一行从左到右递增，每一列从上到下递增．
    输入一个二维数组和一个整数，判断数组中是否含有整数
     */

    public boolean find(int[][] array,int number)
    {
        if (array==null)
        {
            return false;
        }
        int column=array[0].length-1,row=0;
        while (row<array.length && column>=0)
        {
            if(array[row][column]==number)
            {
                return true;
            }
            if(array[row][column]>number)
            {
                column--;
            }
            else
            {
                row++;
            }

        }
        return false;
    }
}
