import java.util.*;

class WaveTraversal
{
    static void print(int res[][])
    {
        for(int j=0; j<res[0].length; j++)
        {
            if(j%2 == 0)
            {
                for(int i=0; i<res.length; i++)
                {
                    System.out.println(res[i][j]);
                }
            }
            else
            {
                for(int i=res.length-1; i>=0; i--)
                {
                    System.out.println(res[i][j]);
                }
            }

        }
    }
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int m = sobj.nextInt();

        int mat[][] = new int[n][m];

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                mat[i][j] = sobj.nextInt();
            }
        }

        print(mat);

    }
}