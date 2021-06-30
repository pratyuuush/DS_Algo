import java.util.*;

class Remv_Dup_Unsorted_7
{
    static Node head;

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

    static void insertEnd(int data)
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

    static void remDup()
    {
        HashMap<Node, Integer> hm = new HashMap<Node, Integer>();

        Node last = head;
        Node prev = null;

        while(last != null)
        {
            if(hm.containsValue(last.data))
            {
                prev.next = last.next;
                last = prev.next;
            }
            else
            {
                hm.put(last, last.data);
                prev = last;
                last = last.next;
            }
        }
    }

    
    static void printList()
    {
        if(head == null)
        {
           System.out.println("List is empty");
            return;
        }

        Node last = head;

        while(last != null)
        {
            System.out.print(last.data + " ");
            last = last.next;
        }
        System.out.println();
    }


    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int data = sobj.nextInt();
            insertEnd(data);
        }

        printList();
        remDup();
        printList();

    }
}