import java.util.*;

public class BfsAndDfs {
    
    private static void dfsUtil(int vertex, List<Integer>[] adjList, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int adjVertex : adjList[vertex]) {
            if (!visited[adjVertex]) {
                dfsUtil(adjVertex, adjList, visited);
            }
        }
    }
    
    public static void dfs(List<Integer>[] adjList) {
        int numVertices = adjList.length;
        boolean[] visited = new boolean[numVertices];
        for (int vertex = 1; vertex < numVertices; vertex++) {
            if (!visited[vertex]) {
                dfsUtil(vertex, adjList, visited);
            }
        }
    }
    
    public static void bfs(List<Integer>[] adjList) {
        int numVertices = adjList.length;
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        visited[1] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int adjVertex : adjList[vertex]) {
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.offer(adjVertex);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int numVertices = 8; // 7 vertices numbered 1 to 7
        List<Integer>[] adjList = new List[numVertices];
        for (int vertex = 1; vertex < numVertices; vertex++) {
            adjList[vertex] = new ArrayList<Integer>();
        }
        adjList[1].add(2);
        adjList[1].add(6);
        adjList[2].add(3);
        adjList[2].add(4);
        adjList[3].add(5);
        adjList[4].add(5);
//        adjList[5].add(6);
        adjList[6].add(7);
        System.out.print("DFS traversal: ");
        dfs(adjList);
        System.out.println();
        System.out.print("BFS traversal: ");
        bfs(adjList);
    }
}
