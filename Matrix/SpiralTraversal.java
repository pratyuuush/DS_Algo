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

        int minr = 0;
        int minc = 0;
        int maxr = mat.length;
        int maxc = mat[0].length;
        int temp = row*col;
        int cnt = 0;

        while(cnt < temp)
        {
            for(int i=minr, j=minc; i<=maxr; i++)
            {
                System.out.println(mat[i][j]);
                cnt++;
            }
            minc++;

            for(int j=minc, i=maxr; j<=maxc; j++)
            {
                System.out.println(mat[i][j]);
                cnt++;
            }
            maxr--;

            for(int i=maxr, j=maxc; i>=minr; i--)
            {
                System.out.println(mat[i][j]);
                cnt++;
            }
            maxc--;

            for(int j=maxc, i=minr; j>=minc; j--)
            {
                System.out.println(mat[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}

/*import java.util.*;

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
}*/