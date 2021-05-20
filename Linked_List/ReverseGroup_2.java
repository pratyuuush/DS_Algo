import java.util.LinkedList;
import java.util.*;

class ReverseGroup_2
{
    public static void reverseLL(int k, LinkedList ll)
    {
       
    }

    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner sobj = new Scanner(System.in);
        int k = sobj.nextInt();

        for(int i=0; i<8; i++)
        {
            ll.add(sobj.nextInt());
        }

        
        reverseLL(k,ll);
    }
}

/*class ReverseGroup_2
{
    public static void reverseLL(int k, LinkedList ll)
    {
       for(int i=k-1; i>=0; i--)
       {
            System.out.println(ll.get(i));
       }

       for(int i=7; i>k-1; i--)
       {
            System.out.println(ll.get(i));
       }
    }

    public static void main(String args[])
    {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Scanner sobj = new Scanner(System.in);
        int k = sobj.nextInt();

        for(int i=0; i<8; i++)
        {
            ll.add(sobj.nextInt());
        }

        
        reverseLL(k,ll);
    }
}*/