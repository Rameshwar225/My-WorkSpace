package BFSAndDFS;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


class Graph1
{
	ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();;
	int v;
	
	Graph1(int v)
	{
		v=v;
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
	
	void printGraph()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("node: "+i);
			
			for(int x:graph.get(i))
			{
				System.out.println("-> "+ x);
			}
		}
		
	}
	
	void bsf(int start)
	{
		boolean visited[] = new boolean[v];
		
		Queue<Integer>q = new LinkedList<Integer>();
		q.add(start);
		visited[start] =true;
		
		while(q.isEmpty()==false)
		{
			int node = q.poll();
			System.out.println(node);
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
public class graph1 {

	public static void main(String[] args) {
		Graph1 g = new Graph1(4);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 1);
		g.addEdge(2, 3);
		
		g.printGraph();
	}

}
