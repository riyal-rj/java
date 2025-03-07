package Arrays.Leetcode;

public class DiagonalElementsTraverse {

    private int []diagonalTraverse(int [][]mat)
    {
        int m=mat.length;
        int n=mat.length;

        int row=0,col=0,index=0;
        boolean up=true;
        int []result=new int[m*n];

        while(index < m*n)
        {
            result[index++]=mat[row][col];

            if(up)// Move up-right
            {
                if(col == n-1)
                {
                    row++;
                    up=false;
                }
                else if( row == 0)
                {
                    col++;
                    up=false;
                }
                else
                {
                    row--;
                    col++;
                }
            }
            else // Move down - left
            {
                if(row == m-1)
                {
                    col++;
                    up=true;
                }
                else if(col == 0)
                {
                    row++;
                    up=true;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}
