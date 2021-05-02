import java.util.*;

class ReverseLL_1 
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