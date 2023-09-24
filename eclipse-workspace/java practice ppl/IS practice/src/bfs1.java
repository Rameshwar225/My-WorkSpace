import java.util.*;

class Graph1
{
	ArrayList<ArrayList<Integer>>graph;
	int v;
	
	Graph1(int node)
	{
		v= node;
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	
	void addEdge(int v, int u)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	void print()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("node: "+i);
			for(int x: graph.get(i))
			{
				System.out.println("-> "+x);
			}
		}
	}
	
	void bsf(int start)
	{
		boolean visited[] = new boolean[v];
		System.out.println("BSF travel");
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		
		while(q.isEmpty()==false)
		{
			int node =q.poll();
			System.out.println(node +" ");
			
			for(int x: graph.get(node))
			{
				if(visited[x]==false)
				{
					visited[x] = true;
					q.add(x);
				}
			}
		}
		
		
	}
}
public class bfs1 {
	
	public static void main(String args[])
	{
		Graph1 g1 = new Graph1(5);
		g1.addEdge(0, 1);
		g1.addEdge(0, 3);
		g1.addEdge(2, 1);
		g1.addEdge(3, 1);
		g1.addEdge(2, 4);
		g1.print();
		g1.bsf(0);
	}

}
