//O(n)
import java.util.*;

class NextPermutation_15
{
    static int[] swap(int a[], int i, int j)
    {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;

        return a;
    }

    static void reverse(int a[], int i, int n)
    {
       int m = n-1;
       i = i + 1;
        while (i < m) 
        { 
            int temp = a[i]; 
            a[i++] = a[m]; 
            a[m--] = temp; 
        } 
        System.out.print("Next Permutation is: ");
        for(int k=0; k<n; k++)
        {
            System.out.print(a[k]);
        }
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();

        if(n <= 1)
        {
            System.out.println("Invalid Input");
            return;
        }

        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        int i=n-1;
        while(i>1)
        {
            if(a[i-1] < a[i])
            {
                break;
            }
            i--;
        }


        if(i <= 1)
        {
            System.out.print("Next Permutation is: ");
            for(int s=n-1; s>=0; s--)
            {
                System.out.print(a[s]);
            }
        }
        else
        {

            int j=n-1;
            i = i-1;
            while(j>=0)
            {
                if(a[j] > a[i])
                {
                    a = swap(a,j,i);
                    break;
                }
                j--;
            }

            reverse(a,i,n);
        }
    }
}