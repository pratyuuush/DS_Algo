import java.util.*;

class BFS
{
    int V;
    LinkedList<Integer> adj[];

    BFS(int v)
    {
        V = v;

        adj = new LinkedList[v];

        for(int i=0; i<v; i++)
        {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    void BFS(int s)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;

        while(queue.size() != 0)
        {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();

            while(i.hasNext())
            {
                int n = i.next();

                if(!visited[n])
                {
                    queue.add(n);
                    visited[n] = true;
                }
            }
        }

    }

    public static void main(String args[])
    {
        BFS bobj = new BFS(4);
        bobj.addEdge(0, 1);
        bobj.addEdge(0, 2);
        bobj.addEdge(1, 2);
        bobj.addEdge(2, 0);
        bobj.addEdge(2, 3);
        bobj.addEdge(3, 3);

        bobj.BFS(1);
    }
}