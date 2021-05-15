//O(n*n)
import java.util.*;

class BubbleSort
{
    public static void bubbleSort(int a[], int n)
    {
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)  //5 6 11 12 33
            {
                if(a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();    

        
        System.out.println("Array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }    
        System.out.println();

        bubbleSort(a,n);
    }
}