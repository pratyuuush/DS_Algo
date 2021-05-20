import java.util.*;
import java.util.LinkedList;

//Recursive code
class ReverseLL_1
{
    Node head;
    Node rleft;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printList()
    {
        if(head == null)
        {
            System.out.println("List is null");
            return;
        }

        Node nextEle = head;

        while(nextEle != null)
        {
            System.out.print(nextEle.data + " ");
            nextEle = nextEle.next;
        }

        System.out.println();
    }

    void reverse()
    {
        rleft = head;
        reverseLL(head,0,4);
    }

    void reverseLL(Node n, int floor, int size)
    {
        if(n == null)
        {
            return;
        }
        floor = floor+1;
        reverseLL(n.next, floor , size);
        if(floor > size/2)
        {

            int temp = n.data;
            n.data = rleft.data;
            rleft.data = temp;

            rleft = rleft.next;
        }
    }

    void insertEnd(int data)
    {   
        Node new_node = new Node(data);

        if(head == null)
        {
            head = new_node;
            return;
        }

        Node last = head;

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = new_node;
        return;
    }
    
    public static void main(String args[])
    {
        ReverseLL_1 rr = new ReverseLL_1();
        rr.insertEnd(10);
        rr.insertEnd(20);
        rr.insertEnd(30);           
        rr.insertEnd(40);

        rr.printList();

        rr.reverse();

        rr.printList();
    }
}

/*import java.util.*;
import java.util.LinkedList;

class ReverseLL_1
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printList()
    {
        if(head == null)
        {
            System.out.println("List is null");
            return;
        }

        Node nextEle = head;

        while(nextEle != null)
        {
            System.out.print(nextEle.data + " ");
            nextEle = nextEle.next;
        }

        System.out.println();
    }

    void reverseLL(Node n)
    {
        if(n == null)
        {
            return;
        }

        reverseLL(n.next);
        System.out.print(n.data + " ");
    }

    void insertEnd(int data)
    {   
        Node new_node = new Node(data);

        if(head == null)
        {
            head = new_node;
            return;
        }

        Node last = head;

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = new_node;
        return;
    }
    
    public static void main(String args[])
    {
        ReverseLL_1 rr = new ReverseLL_1();
        rr.insertEnd(10);
        rr.insertEnd(20);
        rr.insertEnd(30);           
        rr.insertEnd(40);

        rr.printList();

        rr.reverseLL(rr.head);

    
    }
}
*/

/* Iterative way of reversing a Linked List

import java.util.*;
import java.util.LinkedList;

class ReverseLL_1
{
    Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void printList()
    {
        if(head == null)
        {
            System.out.println("List is null");
            return;
        }

        Node nextEle = head;

        while(nextEle != null)
        {
            System.out.print(nextEle.data + " ");
            nextEle = nextEle.next;
        }

        System.out.println();
    }

    void reverseLL()
    {
        Node current = head;
        Node prev = null, next = null;

        while(current != null)
        {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;
        }

        head = prev;
    }

    void insertEnd(int data)
    {   
        Node new_node = new Node(data);

        if(head == null)
        {
            head = new_node;
            return;
        }

        Node last = head;

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = new_node;
        return;
    }
    
    public static void main(String args[])
    {
        ReverseLL_1 rr = new ReverseLL_1();
        rr.insertEnd(10);
        rr.insertEnd(20);
        rr.insertEnd(30);           
        rr.insertEnd(40);

        rr.printList();

        rr.reverseLL();

        rr.printList();
    }
}
*/
/*class ReverseLL_1 
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

    public void insertBeginning(int data) 
    {
        Node new_node = new Node(data);
        
        new_node.next = head;
        head = new_node;
    }


    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        for(int i=0; i<n; i++)
        {
            llist.insertBeginning(sobj.nextInt());
        }
        llist.printList();
    } 
} 

*/








/*import java.util.LinkedList;
import java.util.*;

class ReverseLL_1
{
    public static void main(String args[])
    {
        List<Integer> ll = new LinkedList<Integer>();
        Scanner sobj = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
           ll.add(sobj.nextInt()); 
        }

        for(int i=0; i<5; i++)
        {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println("null");

        for(int i=4; i>=0; i--)
        {
            System.out.print(ll.get(i) + " ");
        }
    }
}*/