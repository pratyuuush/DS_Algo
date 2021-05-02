import java.util.*;

class ReverseGroup_2 
{ 
    Node head; 
  
    static class Node //Node creation
    { 
        int data; 
        Node next; 
       
        Node(int d) 
        {
            data = d; 
            next = null; 
        } 
    } 
    
    public void printList() //Traversal
    {
        Node n = head;

        if(n == null) //Empty list
        {
            System.out.println("Linked List is empty");
            return;
        }

        while(n != null) //traversing
        {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public void reverseGrp(int data, int k) 
    {
        int count = 0;

        if(count <= k)
        {
            Node new_node = new Node(data);
        
            new_node.next = head;
            head = new_node;
        }

        
    }


    public static void main(String[] args) 
    { 
        ReverseGroup_2 llist = new ReverseGroup_2(); 
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int k = sobj.nextInt();
        for(int i=0; i<n; i++)
        {
            llist.reverseGrp(sobj.nextInt(),k);
        }
        llist.printList();
    } 
} 







/*(import java.util.LinkedList;
import java.util.*;

class ReverseGroup_2
{

    static void printList(int n, List ll)
    {
        for(int i=0; i<n; i++)
        {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();
    }

    static void reverseGrp(List ll, List nl, int n, int k)
    {
        for(int i=k-1; i>=0; i--)
        {
            nl.add(ll.get(i));
        }

        for(int i=n-1; i>=k; i--)
        {
            nl.add(ll.get(i));
        }

        printList(n, nl);
    }

    public static void main(String args[])
    {
        List<Integer> ll = new LinkedList<Integer>();
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        int k = sobj.nextInt();

        for(int i=0; i<n; i++)
        {
           ll.add(sobj.nextInt()); 
        }

        List<Integer> nl = new LinkedList<Integer>();

        printList(n, ll);
        reverseGrp(ll,nl,n,k);

    }
}*/