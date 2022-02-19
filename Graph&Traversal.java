import java.util.*;

public class Solution {
    public static class Graph {

        ArrayList<ArrayList<Integer>> adjList; // number of vertices = size of adjList

        public Graph(int numOfVertices) {
            adjList = new ArrayList<>();
            for (int i = 0; i < numOfVertices; ++i) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int from, int to) {
            adjList.get(from).add(to);
        }
    }

    /**
     * The method for you to implement.
     */
    public int shortestPath(Graph g, int start, int end) {
        // TODO
        return -1;
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(2, 1);
        graph.addEdge(2, 5);
        graph.addEdge(3, 2);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(6, 3);
        Solution solution = new Solution();
        System.out.println(solution.shortestPath(graph, 0 , 3)); // should be 2
        System.out.println(solution.shortestPath(graph, 0 , 1)); // should be 1
        System.out.println(solution.shortestPath(graph, 6 , 0)); // should be -1
    }
}
