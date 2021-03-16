class LinkedList 
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

    public void deleteBeginning()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }

        Node new_node = head;
        head = new_node.next;
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

    public void deleteAtEnd()
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        Node n = head;
        Node prev = null;

        while(n.next != null)
        {
            prev = n;
            n = n.next;
        }

        prev.next = null;

       /* int count=0;
        while(n != null)
        {
            count++;
            n = n.next;
        }

        n = head;
        int i = 0;

        while(i < count-2)
        {
            n = n.next;
            i++;
        }
        n.next = null;
*/

    }

    public void deleteAtGivenIndex(int index)
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }
    
        Node n = head;
        int i = 0;

        while(i < index-1)
        {   
            n = n.next;
            i++;
        }

        Node indexJoin = n.next;
        n.next = indexJoin.next;

    }

    public void deleteGivenValue(int key)
    {
        if(head == null)
        {
            System.out.println("Linked list is empty");
            return;
        }
    
        Node n = head;
        Node prev = null;
        

        while(key != n.data && n != null)
        {
            prev = n;
            n = n.next;
        }

        if(n == null) //if key is not present
        {
            return;
        }
        
        prev.next = n.next;
    }

    public void insertAfter(Node prev_node, int data)
    {
        if(prev_node == null)
        {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node new_node = new Node(data);

        new_node.next = prev_node.next;
        prev_node.next = new_node;

        return;
    }

    public static void main(String[] args) 
    { 
        LinkedList llist = new LinkedList(); 
       
        
        llist.insertBeginning(4);
        llist.insertEnd(10);
        llist.insertBeginning(5);
        llist.insertEnd(11);
        llist.insertBeginning(41);
        llist.insertEnd(101);
        llist.insertBeginning(25);
        llist.insertEnd(112);
        llist.printList(); 
        llist.deleteGivenValue(41);
        llist.printList();
       
    } 
} 