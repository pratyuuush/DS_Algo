class CirQ
{
    static final int MAX=2;
    int a[] = new int[MAX];
    int r, f;

    CirQ()
    {
        r = -1;
        f = -1;
    }

    boolean isEmpty()
    {
        if(r == f)
        {
            return true;
        }
        return false;
    }

    boolean isFull()
    {
        if(r == MAX-1)
        {
            return true;
        }
        return false;
    }

    void printQueue()
    {
        if(f == -1)
        {
            System.out.print("Queue is Empty");
            return;
        }
    
        System.out.print("Elements in the " +
                        "circular queue are: ");
    
        if(r >= f)
        {
            for(int i = f; i <= r; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    
        else
        {
            for(int i = f; i < a.length; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
    
           
            for(int i = 0; i <= r; i++)
            {
                System.out.print(a[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void enqueue(int data)
    {
        if(f==-1 && r==-1)      
        {  
            f=0;  
            r=0;  
            a[r]=data;  
        }  
        else if((r+1)%MAX==f)    
        {  
            System.out.println("Queue is overflow..");  
        }  
        else  
        {  
            r=(r+1)%MAX;      
            a[r]=data;      
        }  
    }

    void dequeue()
    {
        if(f==r)
        {
            System.out.println("Queue is empty");
            return;
        }

        f++;
    }

}

class CircularQueue
{
    public static void main(String args[]) 
    {
        CirQ q = new CirQ();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(10);
        q.enqueue(20);
        q.printQueue();
        q.dequeue();
        q.enqueue(40);
        q.printQueue();

    }
}