import java.util.*;
/* Program wth O(n^2) complexity*/ 
class Union_6
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sobj.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int m = 2*n;
        int c[] = new int[m];
    
        System.out.println("Enter array 1");
        for(int i=0; i<n; i++)
        {
          a[i] = sobj.nextInt();
        }
    
        System.out.println("Enter array 2");
        for(int i=0; i<n; i++)
        {
          b[i] = sobj.nextInt();
        }
        int i;
        
        for(i=0; i<n; i++)
        {
            c[i] = a[i];
            
        }

        int flag = 0;

        for(int j=0; j<n; j++)
        {
            for(int k=0; k<n; k++)
            {
                if(b[j] == a[k])
                {
                   flag++; 
                }
            }
            if(flag == 0)
            {
                c[i] = b[j];
                i++;
                flag=0;
            }
            flag = 0;
        }

        System.out.println("Final Array");
        
        for(int j=0; j<i; j++)
        {
            System.out.println(c[j]);
        }
         
        
    }
}

/* This is program of O(m+n) complexity
class FindUnion { 
   
    static int printUnion(int arr1[], int arr2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        while (i < m && j < n) { 
            if (arr1[i] < arr2[j]) 
                System.out.print(arr1[i++] + " "); 
            else if (arr2[j] < arr1[i]) 
                System.out.print(arr2[j++] + " "); 
            else { 
                System.out.print(arr2[j++] + " "); 
                i++; 
            } 
        } 
  
        while (i < m) 
            System.out.print(arr1[i++] + " "); 
        while (j < n) 
            System.out.print(arr2[j++] + " "); 
  
        return 0; 
    } 
  
    public static void main(String args[]) 
    { 
        int arr1[] = { 1, 2, 4, 5, 6 }; 
        int arr2[] = { 2, 3, 5, 7 }; 
        int m = arr1.length; 
        int n = arr2.length; 
        printUnion(arr1, arr2, m, n); 
    } 
} 
*/