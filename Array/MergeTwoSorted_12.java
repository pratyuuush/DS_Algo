import java.util.*;

class MergeTwoSorted_12
{
    public static void main(String args[]) 
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int m = sobj.nextInt();
        
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for(int i=0; i<n; i++)
        {
            arr1[i] = sobj.nextInt();
        }

        for(int i=0; i<m; i++)
        {
            arr2[i] = sobj.nextInt();
        }

        int i=0;
        int j=0;
        System.out.println("Sorted array is");
        while(i<n && j<m)
        {
            if(arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");
            else if(arr1[i] > arr2[j])
                System.out.print(arr2[j++] + " ");
            else if(arr1[i] == arr2[j])
            {
                System.out.print(arr1[i++] + " ");
                System.out.print(arr2[j++] + " ");
            }
        }

        while(i < n)
            System.out.print(arr1[i++] + " ");
        while(j < m)
            System.out.print(arr2[j++] + " ");
    }
}