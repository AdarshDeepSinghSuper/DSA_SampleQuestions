import java.util.*;
public class Sudoku1 {
    public static boolean isSafe(char[][] board, int row, int col, int number) {
        // Check for row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0'))//type casting
            {
                return false;
            }
        }
        // Check for column
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0'))//type casting 
            {
                return false;
            }
        }
        // Check for 3*3 grid
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0'))//type casting 
                {
                    return false;
                }
            }
        }
        return true; // Corrected to return true when no conflicts found
    }

    public static boolean helper(char[][] board, int row, int col) {
        if (row == board.length) {
            return true;
        }
        int nrow, ncol;
        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {
            // Fill the place
            for (int i = 1; i <= 9; i++) { // Changed loop bounds to 1-9
                if (isSafe(board, row, col, i)) 
                {
                    board[row][col] = (char) (i + '0');//type casting
                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void output(char[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] sudoku = {  
            {'2','.','5','3','.','.','.','.','9'},
            {'.','3','.','4','.','.','8','2','.'},
            {'.','4','8','.','.','.','.','3','1'},
            {'.','2','.','.','.','.','.','.','.'},
            {'.','.','4','.','.','.','2','.','8'},
            {'1','6','9','.','.','4','7','.','.'},
            {'.','.','7','1','.','.','9','.','.'},
            {'.','.','.','.','7','.','1','.','.'},
            {'.','.','.','2','.','.','.','.','4'},
        };
        solveSudoku(sudoku);
        output(sudoku);
    }
}
