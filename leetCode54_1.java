import java.util.ArrayList;

public class leetCode54_1 {
    public static ArrayList<Integer> SpiralOrder(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        int dir = 0;
        /*
         * dir = 0 : left to right
         * dir = 1 : top to down
         * dir = 2 : right to left
         * dir = 3 : down to top
         */
        // initializing top down right and left
        int left = 0;
        int right = n - 1; // column size -1
        int top = 0;
        int down = m - 1; // row size -1
        // initializing result array list
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (top <= down && left <= right) {
            if (dir == 0) {
                // left to right
                // constant: row(top row)
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
            } else if (dir == 1) {
                // top to down
                // constant: column(right column)
                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            } else if (dir == 2) {
                // right to left
                // constant: row(down row)
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
            } else if (dir == 3) {
                // down to top
                // constant: column(left column)
                for (int i = down; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        ArrayList<Integer> list = SpiralOrder(matrix);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
