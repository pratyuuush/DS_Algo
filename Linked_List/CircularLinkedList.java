class CircularLinkedList
{
    static class Node
    {
        int data;
        Node next;
    }
    
    static Node insertFirst(Node head_ref, int data)
    {
        Node new_node = new Node();
        Node n = head_ref;
        new_node.data = data;
        new_node.next = head_ref;
    
       
        if (head_ref != null)
        {
            while(n.next != head_ref)
            {
                n = n.next;
            }
                
            n.next = new_node;
        }
        else
        {
            new_node.next = new_node; 
        }
            
    
        head_ref = new_node;
        
        return head_ref;
    }
    
    static void printList(Node head)
    {
        Node n = head;
        if (head != null)
        {
            do
            {
                System.out.print(n.data + " ");
                n = n.next;
            }
            while (n != head);
        }
        else{
            System.out.println("List is empty");
        }
        System.out.println();
    }
    
    static Node deleteGivenValue(Node head, int key)
    {
        if (head == null)
            return null;
 
        Node curr = head;
        Node prev = new Node();

        while (curr.data != key) 
        {
            if (curr.next == head) 
            {
                System.out.println("Given node is not found in the list!!!");
                break;
            }
 
            prev = curr;
            curr = curr.next;
        }
 
        if (curr == head && curr.next == head) 
        {
            head = null;
            return head;
        }
 
        if (curr == head) 
        {
            prev = head;

            while (prev.next != head)
            {
                prev = prev.next;
            }
                
            head = curr.next;
            prev.next = head;
        }
        else if (curr.next == head) 
        {
            prev.next = head;
        }
        else 
        {
            prev.next = curr.next;
        }
        return head;
    }

    public static void main(String args[])
    {
        
        Node head = null;
    
        head = insertFirst(head, 12);
        head = insertFirst(head, 22);
        head = insertFirst(head, 32);
        head = insertFirst(head, 42);
        head = deleteGivenValue(head, 7);
    
        System.out.println("Contents of Circular " + "Linked List:");
        printList(head);
    
    }
}
 