//O(n*n)
import java.util.*;

class InsertionSort
{
    public static void insertionSort(int a[], int n)
    {
        for(int i=1; i<n; i++)
        {
            int key = a[i];
            int j = i-1;

            while(j>=0 && a[j] > key)
            {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = key;   
                           
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

        insertionSort(a,n);
    }
}
        