import java.util.*;

class FirstOcc
{
    public static void firstOcc(int idx, int a[], int k)
    {
        
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

        int k = sobj.nextInt();

        firstOcc(0,a,k);
    }
}