import java.util.*;

class DFS
{
    int V;
    LinkedList<Integer> adj[];

    DFS(int v)
    {
        V = v;
        adj = new LinkedList[V];

        for(int i=0; i<v; i++)
        {
            adj[i] = new LinkedList();
        }

    }

    void DFSUtil(int s, boolean visited[])
    {
        System.out.print(s + " ");
        visited[s] = true;

        Iterator<Integer> i = adj[s].listIterator();

        while(i.hasNext())
        {
            int n = i.next();

            if(!visited[n])
            {
                DFSUtil(n,visited);
            }
        }

    }

    void DFS(int s)
    {
        boolean visited[] = new boolean[V];

        DFSUtil(s,visited);
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    public static void main(String args[])
    {
        DFS dobj = new DFS(4);

        dobj.addEdge(0, 1);
        dobj.addEdge(0, 2);
        dobj.addEdge(1, 2);
        dobj.addEdge(2, 0);
        dobj.addEdge(2, 3);
        dobj.addEdge(3, 3);

        dobj.DFS(2);
    }
}