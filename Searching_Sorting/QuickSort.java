//O(n*n)
import java.util.*;

class QuickSort
{
    public static void printArray(int a[], int n)
    {
        System.out.println("Array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(a[i] + " ");
        }    
        System.out.println();
    }

    public static int partition(int a[], int low, int high)
    {
        int pivot = a[low];
        int i = low+1;
        int j = high;
        int temp;
        do
        {
            while(a[i] >= pivot)
            {
                i++;
            }
            while(a[j] < pivot)
            {
                j--;
            }
            if(i<j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }while(i<j);

        temp = a[low];
        a[low] = a[j];
        a[j] = temp;
        return j;
       
    }

    public static void quickSort(int a[], int low, int high)
    {
        if(low < high)
        {
            int pi = partition(a,low,high);
            quickSort(a,low,pi-1);
            quickSort(a,pi+1,high);
        }
    }

    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();    

        printArray(a,n);

        quickSort(a,0,n-1);   
        
        printArray(a,n);
    }
}