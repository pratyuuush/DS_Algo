import java.util.*;

class Multiply
{

    static void print(int res[][])
    {
        for(int i=0; i<res.length; i++)
        {
            for(int j=0; j<res[0].length; j++)
            {
                System.out.println(res[i][j]);
            }
        }
    }

    static void mul(int res[][], int mat1[][], int mat2[][])
    {
        //Multiplication is done row by column
        for(int i=0; i<res.length; i++)
        {
            for(int j=0; j<res[0].length; j++)
            {
                for(int k=0; k<mat2.length; k++)
                {
                    res[i][j] += mat1[i][k]*mat2[k][j]; 
                }
            }
        }

        print(res);
    }
    
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n1 = sobj.nextInt();
        int m1 = sobj.nextInt();
        int n2 = sobj.nextInt();
        int m2 = sobj.nextInt();

        int mat1[][] = new int[n1][m1];
        int mat2[][] = new int[n2][m2];

        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<m1; j++)
            {
                mat1[i][j] = sobj.nextInt();
            }
        }

        for(int i=0; i<n2; i++)
        {
            for(int j=0; j<m2; j++)
            {
                mat2[i][j] = sobj.nextInt();
            }
        }

        if(n2 != m1)
        {
            System.out.println("Cannot Multiply");
            return;
        }

        int res[][] = new int[n1][m2];
        mul(res,mat1,mat2);


        
    }
}