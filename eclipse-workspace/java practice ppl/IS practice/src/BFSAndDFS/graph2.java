package BFSAndDFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph5
{
	ArrayList<ArrayList<Integer>> graph;
	int v;
	
	Graph5(int node)
	{
		v= node;
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			graph.add( new ArrayList<Integer>());
		}
	}
	
	void addEdge(int v, int u)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
	}
	
	void display()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("Node: "+i);
		
			for(int x: graph.get(i))
			{
				System.out.println("-> "+x);
			}
				
		}
	}
	
	void bfs(int start)
	{
		boolean visited[] = new boolean[v];
		System.out.println("BSF traversal");
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		
		while(q.isEmpty()==false)
		{
			int node = q.poll();
			System.out.println(node + " ");
			
			for(int x: graph.get(node))
			{
				if(visited[x] ==false)
				{
					visited[x] = true;
					q.add(x);
				}
			}
		}
	}
}
public class graph2 {

	public static void main(String[] args) {
		
		Graph5 g2 = new Graph5(5);
		g2.addEdge(0, 2);
		g2.addEdge(1, 2);
		g2.addEdge(4, 0);
		g2.addEdge(3, 4);
		g2.addEdge(1, 3);
		
		g2.display();
		
	    g2.bfs(0);

	}

}
