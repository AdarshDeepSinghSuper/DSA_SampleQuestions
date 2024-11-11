public class SearchinMatrix {
    //in string function return have " " inside this we have to write what we want to return
    public static String searchInMatrix(int[][] matrix, int x) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return "Matrix is empty";
        }

        int rows = matrix.length;//length function for row
        int cols = matrix[0].length;//for column 

        // Start from the top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == x) {
                return "Element found at position : (" + row + " " + col + ")";
            } else if (matrix[row][col] > x) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        return "Element not found";
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 15},
               {10, 13, 100, 150}
        };

        int x = 6;
        System.out.println(searchInMatrix(matrix, x)); // Element found at position (2, 1)

        x = 100;
        System.out.println(searchInMatrix(matrix, x)); // Output: Element not found
    }

  
}
