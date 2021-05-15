//O(nlogn)
import java.util.*;

class MergeSort
{
    static void printArray(int a[], int n)
    {
        System.out.print("Array is: ");

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    static void mergeSort(int a[], int low, int high)  
    {
        if(low < high)
        {
            int mid = low + (high-low)/2;

            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }

    static void merge(int a[], int low, int mid, int high)
    {
        int i, j, k;
        int b[] = new int[100];
        i = low;
        j = mid+1;
        k = low;
        

        while(i <= mid && j <= high)
        {
            if(a[i] < a[j])
            {
                b[k] = a[i];
                i++;
                k++;
            }
            else
            {
                b[k] = a[j];
                j++;
                k++;
            }
        }

        while (i <= mid)
        {
            b[k] = a[i];
            k++;
            i++;
        }
        while (j <= high)
        {
            b[k] = a[j];
            k++;
            j++;
        }
        for (i = low; i <= high; i++)
        {
            a[i] = b[i];
        }

    }

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];

        for(int i=0; i<n; i++)
        {
            a[i] = sobj.nextInt();
        }

        printArray(a,n);
        mergeSort(a,0,n-1);
        printArray(a,n);
    }
}