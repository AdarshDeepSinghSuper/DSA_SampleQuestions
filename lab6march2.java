public class lab6march2{
    public static String search(int[][]matrix,int x)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //top right
        int row = 0 ;
        int col = cols-1;
        while(row<rows&& col>=0)
        {
            if(matrix[row][col] == x)
            {
                return"Element found at (" + row + " " + col + ")";
            }
            else if(matrix[row][col]>x)
            {
                col--;//move lest
            }
            else
            {
                row++;//move down
            }
            return "element not found ";
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 15},
                {10, 13, 14, 16}
        };

        int x = 6;
        System.out.println(search(matrix, x)); // Output: Element found at position (2, 1)

        x = 20;
        System.out.println(search(matrix, x)); // Output: Element not found
    }
}