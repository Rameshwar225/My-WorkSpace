import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph
{
	ArrayList<ArrayList<Integer>>graph;
	int v;
	
	Graph(int node)
	{
		v= node;
		
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	
	void addEdge(int v,int u)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	void print()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("Node: "+i);
			for(int x: graph.get(i))
			{
				System.out.println("-> "+ x);
			}
		}
		
	}
	
	void bfs(int start)
	{
		boolean visited[] = new boolean[v];
		System.out.println("BSF travesal");
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		
		while(q.isEmpty()==false)
		{
			int node = q.poll();
			System.out.println("Node "+ node);
			
			for(int x: graph.get(node))
			{
				if(visited[x] == false)
				{
					visited[x] = true;
					q.add(x);
				}
			}
		}
		
	}
	
}
public class bfs {

	public static void main(String[] args) {
		
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(2, 1);
		g.addEdge(3, 1);
		g.addEdge(4, 2);
		g.addEdge(3, 0);
		g.print();
		
		g.bfs(0);
		

	}

}
