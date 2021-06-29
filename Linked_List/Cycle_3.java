import java.util.*;

class Cycle_3
{
    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            next = null;
            data = d;
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

    static void insertLoop(int loc)
    {
        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }

        Node last = head;
        Node location = head;
        int count = 0;
        while(count != loc)
        {
            location = location.next;
            last = last.next;
            count++;
        }

        while(last.next != null)
        {
            last = last.next;
        }

        last.next = location;
    }

    static void detectLoop()
    {
        HashMap<Node, Integer> hm = new HashMap<Node, Integer>();

        Node nextData = head;

        while(nextData.next != null)
        {
            int data = nextData.data;

            if(hm.containsKey(nextData))
            {
                System.out.println("Loop exists");
                return;
            }

            hm.put(nextData,data);
            nextData = nextData.next;
        }
        System.out.println("No loop found");
        return;
    }

    static void detectLoopPointer()
    {
        if(head == null || head.next == null)
        {
            System.out.println("Not a loop");
            return;
        }
        
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer.next != null && fastPointer.next.next != null)
        {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if(slowPointer == fastPointer)
            {
                System.out.println("Detected a Loop");
                return;
            }
        }

        System.out.println("No Loop Found");
        return;
    }

    static void printList()
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

    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);
        int n = sobj.nextInt();
        
        for(int i=0; i<n; i++)
        {
            int data = sobj.nextInt();
            insertEnd(data);
        }

        int loc = sobj.nextInt();
        insertLoop(loc);


        detectLoop();
        detectLoopPointer();
    }
}