package backtracking;
import java.util.*;

public class GraphColoring {
    
    private int[][] graph;
    private int[] colors;
    private int numColors;
    
    public GraphColoring(int[][] graph, int numColors) {
        this.graph = graph;
        this.numColors = numColors;
        this.colors = new int[graph.length];
    }
    
    public void solve() {
        if (solve(0)) {
            System.out.println("Solution found!");
            printColors();
        } else {
            System.out.println("No solution found.");
        }
    }
    
    private boolean solve(int node) {
        if (node == graph.length) {
            return true;
        }
        
        for (int color = 1; color <= numColors; color++) {
            if (isColorValid(node, color)) {
                colors[node] = color;
                if (solve(node + 1)) {
                    return true;
                }
                colors[node] = 0;
            }
        }
        
        return false;
    }
    
    private boolean isColorValid(int node, int color) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && colors[i] == color) {
                return false;
            }
        }
        return true;
    }
    
    private void printColors() {
        for (int i = 0; i < colors.length; i++) {
            System.out.println("Node " + i + " colored with " + colors[i]);
        }
    }
    
    public static void main(String[] args) {
        int[][] graph = {{0, 1, 1, 0},
                         {1, 0, 1, 1},
                         {1, 1, 0, 1},
                         {0, 1, 1, 0}};
        int numColors = 3;
        
        GraphColoring gc = new GraphColoring(graph, numColors);
        gc.solve();
    }
}
