import java.util.*;

class Stack
{
    static final int MAX = 1000;
    int a[] = new int[MAX];
    int top;

    Stack()
    {
        top = -1;
    }

    int peek()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
            return 0;
        }
        else
        {
            int x = a[top];
            return x;    
        }
    }

    boolean push(int x)
    {
        if(top >= (MAX-1))
        {
            System.out.println("Stack overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            System.out.println(x + " entered in the stack");
            return true;
        }
    }

    int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }

    void print()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=0; i<=top; i++)
            {
                System.out.println(a[i]);
            }
        }
       
    }
}

class StackBasicOp
{
    public static void main(String args[]) 
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println("Top element is: " + s.peek());
        s.push(30);
        System.out.println("Printing the stack");
        s.print();
        System.out.println(s.pop() + " popped from the stack.");
        System.out.println("Printing the stack");
        s.print();
    }
}




