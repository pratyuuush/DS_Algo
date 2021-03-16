import java.util.*;

class SpiralTraversal
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int col = sobj.nextInt();
        int row = sobj.nextInt();
        
        int mat[][] = new int[row][col];

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                mat[i][j] = sobj.nextInt();
            }
        }

        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right = col-1;
        int dir = 0;
        
      while(top <= bottom && left <=right)
      {
            if(dir == 0)
            {
                for(int i = left; i <= right; i++)
                {
                    System.out.print(mat[top][i] + " ");
                }
                top++;
            }
            else if(dir == 1)
            {
                for(int i=top; i<= bottom; i++)
                {
                    System.out.print(mat[i][right] + " ");
                }
                right--;
            }
            else if(dir == 2)
            {
                for(int i=right; i>= left; i--)
                {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }
            else if(dir == 3)
            {
                for(int i = bottom; i >= top; i--)
                {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
            dir = (dir+1)%4;
      }


    }
}