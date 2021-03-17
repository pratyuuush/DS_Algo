/*
import java.util.*;

 O(n*n)(For Searching)
class SearchMatrix
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

        int key = sobj.nextInt();
        int i,j;
       
        for(i=0; i<row; i++)
        {
            for(j=0; j<col; j++)
            {
                if(mat[i][j] == key)
                {
                    System.out.println("True");
                    return;
                }
            }
        }
}
*/

import java.util.*;

//O(m+n)
class SearchMatrix
{
    static void searchKey(int mat[][],int row, int col, int key)
    {
        int low = 0;
        int high = col-1;

        while(low >= 0 && low < row && high >= 0 && high < col)
        {
            if(mat[low][high] == key)
            {
                System.out.println("Key found at " + low + ", " + high);
                return;
            }
            else if(mat[low][high] > key)
            {
                high--;
            }    
            else
            {
                low++;
            }
        }
        System.out.println("Not found");
    }
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

        int key = sobj.nextInt();

        searchKey(mat,row,col,key);
    }
}
