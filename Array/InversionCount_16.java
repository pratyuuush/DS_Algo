//O(nlogn)
import java.util.*;

class InversionCount_16
{
    static void printArray(int a[], int n)
    {
        System.out.print("Array is: ");

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    static int mergeSort(int a[], int low, int high)
    {

        int count = 0;
        if(low < high)
        {
            int mid = low + (high-low)/2;

            count = count + mergeSort(a,low,mid);
            count = count + mergeSort(a,mid+1,high);
            count = count + merge(a,low,mid,high);
        }
        return count;
    }

    static int merge(int a[], int low, int mid, int high)
    {
        int i, j, k;
        int b[] = new int[100];
        int count = 0;
        i = low;
        j = mid+1;
        k = low;
        

        while(i <= mid && j <= high)
        {
            if(a[i] <= a[j])
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
                count = count + (mid - i + 1);
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

        return count;

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
        int count = mergeSort(a,0,n-1);
        
        System.out.println(count);
    }
}

/* O(n^2)
import java.util.*;

class InversionCount_16
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int a[] = new int[n];
        int count=0;
        
        for(int i=0; i<n; i++)
            a[i] = sobj.nextInt();
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i != j && i < j)
                {
                    if(a[i] > a[j])
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
*/