import java.util.*;

//O(n) complexity
class Intersection_6
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

    System.out.println("Array after intersection");

    int k=0;
    for(int i=0; i<n; i++)
    {
      for(int j=0; j<n; j++)
      {
        if(a[i] == b[j])
        {
          c[k] = b[j];
          k++;  
        }
      }
    }
   
    for(int p=0; p<k; p++)
    {
      System.out.println(c[p]);
    }


  }
}