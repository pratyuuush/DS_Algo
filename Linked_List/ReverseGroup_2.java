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

    Node reverseGrp(int k,Node head)
    {
        if(head == null || k == 1)
            return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = dummy, prev = dummy, next = dummy;

        int count = 0;

        while(cur.next != null)
        {
            cur = cur.next;
            count++;
        }

        while(count >= k)
        {
            cur = prev.next;
            next = cur.next;

            for(int i=1; i<k; i++)
            {
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            prev = cur;
            count -= k;
        }

        return dummy.next;
        
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

    public void insertEnd(int data) //append
    {
        Node new_node = new Node(data);

        if(head == null)
        {
            head = new_node;
            return;
        }
    
        Node last = head;

        while(last.next != null) //traversing
        {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public static void main(String[] args) 
    { 
        ReverseGroup_2 llist = new ReverseGroup_2(); 
        int k = 3;
        llist.insertEnd(4);
        llist.insertEnd(8);
        llist.insertEnd(2);
        llist.insertEnd(5);
        llist.insertEnd(7);
        llist.insertEnd(10);
        llist.insertEnd(12);
        llist.insertEnd(42);
        llist.printList();
        llist.head = llist.reverseGrp(k,llist.head);
        llist.printList();
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