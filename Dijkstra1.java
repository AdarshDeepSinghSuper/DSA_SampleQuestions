import java.util.Scanner;
import java.util.Arrays;

public class Dijkstra1 {
    public static int[] shortestPath(int[][] mat, int source) {
        int n = mat.length;
        int[] dist = new int[n]; // Array to hold the shortest distances
        boolean[] visited = new boolean[n]; // Array to track visited nodes
        
        // Initialize distances with infinity, and source distance to 0
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 0; i < n - 1; i++) {
            // Find the vertex with the minimum distance value from the set of vertices not yet processed
            int u = minDistance(dist, visited);
            visited[u] = true;

            // Update dist value of the adjacent vertices of the picked vertex
            for (int v = 0; v < n; v++) {
                // Update dist[v] if it's not visited, there is an edge from u to v, 
                // and the total weight of the path from the source to v through u is smaller than the current value of dist[v]
                if (!visited[v] && mat[u][v] != Integer.MAX_VALUE && dist[u] != Integer.MAX_VALUE && dist[u] + mat[u][v] < dist[v]) {
                    dist[v] = dist[u] + mat[u][v];
                }
            }
        }

        return dist;
    }

    // A utility function to find the vertex with the minimum distance value from the set of vertices not yet processed
    private static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = Integer.MAX_VALUE;
        int[][] matrix = {
            {0, 4, z, z, z,z,12},
            {z, 0, 6, z, z,z,z},
            {z, z, 0, 20, z,25,z},
            {z, z, z, 0, z,15,z},
            {z, z, 3, z, 0,30,z}
        };

        int[] shortestDistances = shortestPath(matrix, 0); // assuming source is node 0
        System.out.println("Shortest distances from source node 0:");
        for (int dist : shortestDistances) {
            System.out.print((dist == Integer.MAX_VALUE ? "INF" : dist) + " ");
        }
    }
}
