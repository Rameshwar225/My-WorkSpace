package BFSAndDFS;
import java.util.*;
class G
{
	ArrayList<ArrayList<Integer>> graph ;
	int v;
	private int x;
	
	G(int node)
	{
		v=node;
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	
	void AddEdge(int v, int u)
	{
		graph.get(u).add(v);
		graph.get(v).add(u);
		
	}
	
	void print()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("Node: " + i);
			
			for(int x:graph.get(i))
			{
				System.out.println("-> "+x);
			}
		}
	}
//	void DFSutil(int node, boolean visited[])
//	{
//		visited[node] = true;
//		System.out.println(node+" ");
//		
//		for(int x: graph.get(node));
//		{
//			if(visited[x]==false)
//			{
//				DFSutil(x,visited);
//			}
//		}
//	}
//	void DFS(int Start)
//	{
//		boolean visited[] = new boolean[v];
//		System.out.println("DFS traversal");
//		DFSutil(Start,visited);
//	}
	
	void bsf(int start)
	{
		boolean visited[] = new boolean[v];
		Queue<Integer>q =  new LinkedList<Integer>();
		q.add(start);
		visited[start] = true;
		
		while(q.isEmpty()==false)
		{
			int node = q.poll();
			System.out.println(node +" ");
			for(int x: graph.get(node))
			{
				if(visited[x]==false)
				{
					visited[x] =true;
					q.add(x);
				}
			}
		}
	}
}
public class g {

	public static void main(String[] args) {
		G g1 = new G(5);
		g1.AddEdge(1, 0);
		g1.AddEdge(1, 2);
		g1.AddEdge(3, 0);
		g1.AddEdge(4, 3);
		g1.AddEdge(1, 3);
		g1.print();
		g1.DFS(0);

	}

}
