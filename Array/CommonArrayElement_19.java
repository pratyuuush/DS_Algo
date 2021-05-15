import java.util.*;

class CommonArrayElement_19
{
    public static void main(String args[]) 
    {
        //Testing data
        int n1 = 4, n2 = 5, n3 = 6; 
        int a[] = {1,2,3,4};
        int b[] = {3,4,5,6};
        int c[] = {3,4,6,7};
        
        int i=0,j=0,k=0;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(i<n1 && j<n2 && k<n3)
        {
            if(a[i] == b[j] && b[j] == c[k])
            {
                arr.add(a[i]);

                int ele = a[i];

                while(i<n1 && a[i] == ele)
                    i++;
                
                while(j<n2 && b[j] == ele)
                    j++;
            
                while(k<n3 && c[k] == ele)
                    k++;
            }
            else if(a[i] < b[j])
                i++;
            else if(b[j] < a[i])
                j++;
            else
                k++;
        }

        for(i=0; i<arr.size(); i++)
            System.out.println(arr.get(i));
    }
}