import java.util.*;

public class TSP {
    static int[][] graph; // Adjacency matrix representing the distances between cities
    static int numCities; // Number of cities
    
    // Function to calculate the total distance of a path
    static int calculateTotalDistance(int[] path) {
        int totalDistance = 0;
        for (int i = 0; i < numCities - 1; i++) {
            totalDistance += graph[path[i]][path[i + 1]];
        }
        totalDistance += graph[path[numCities - 1]][path[0]]; // Return to the starting city
        return totalDistance;
    }
    
    // Brute-force algorithm to find the shortest path
    static int[] findShortestPath() {
        int[] shortestPath = new int[numCities];
        int[] currentPath = new int[numCities];
        for (int i = 0; i < numCities; i++) {
            currentPath[i] = i;
        }
        int shortestDistance = Integer.MAX_VALUE;
        
        do {
            int currentDistance = calculateTotalDistance(currentPath);
            if (currentDistance < shortestDistance) {
                shortestDistance = currentDistance;
                shortestPath = Arrays.copyOf(currentPath, numCities);
            }
        } while (nextPermutation(currentPath));
        
        return shortestPath;
    }
    
    // Function to generate the next permutation of an array
    static boolean nextPermutation(int[] arr) {
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        
        int j = arr.length - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        Arrays.sort(arr, i + 1, arr.length);
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        numCities = scanner.nextInt();
        
        graph = new int[numCities][numCities];
        System.out.println("Enter the distances between cities:");
        for (int i = 0; i < numCities; i++) {
            for (int j = 0; j < numCities; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }
        
        int[] shortestPath = findShortestPath();
        System.out.println("Shortest path: " + Arrays.toString(shortestPath));
        System.out.println("Shortest distance: " + calculateTotalDistance(shortestPath));
    }
}
