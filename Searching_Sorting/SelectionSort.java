//O(n*n)
import java.util.*;

class SelectionSort
{
    static void printArray(int a[], int n)
    {
        System.out.print("Array is: ");

        for(int i=0; i<n; i++)
            System.out.print(a[i] + " ");

        System.out.println();
    }

    static void selectionSort(int a[], int n)
    {
        for(int i=0; i<n; i++)
        {
            int min = i;
            for(int j=i+1; j<n; j++) // 5 6 11 12 33
            {
                if(a[j] < a[min])
                    min = j;
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
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
        selectionSort(a,n);
        printArray(a,n);
    }
}