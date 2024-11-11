public class SortedMatrixSearch {

    // Function to search for element x in a sorted matrix
    public static String findElement(int[][] matrix, int x) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0;
        int col = m - 1;

        // Iterate through the matrix elements
        while (row < n && col >= 0) {
            if (matrix[row][col] == x) {
                return "Element found at position: (" + row + ", " + col + ")";
            } else if (matrix[row][col] > x) {
                col--; // Move left in the same row
            } else {
                row++; // Move down to the next row
            }
        }
        
        return "Element not found";
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        
        int x = 6;
        
        System.out.println("Search for element " + x + ": " + findElement(matrix, x));
    }
}
