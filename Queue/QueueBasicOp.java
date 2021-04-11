class Queue
{
    static final int MAX=1000;
    int a[] = new int[MAX];
    int r, f;

    Queue()
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
        if(r==-1)
        {
            System.out.println("Queue is empty");
        }

        for(int i=f+1; i<=r; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    void enqueue(int data)
    {
        if(r==MAX-1)
        {
            System.out.println("Queue is full");
            return;
        }

        r++;
        a[r] = data;
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

class QueueBasicOp
{
    public static void main(String args[]) 
    {
        Queue q = new Queue();
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
        q.enqueue(10);
        q.enqueue(20);
        q.printQueue();
        q.dequeue();
        q.printQueue();

    }
}