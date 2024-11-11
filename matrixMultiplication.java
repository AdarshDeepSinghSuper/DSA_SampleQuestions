public class matrixMultiplication {
    public static int [][] Mul(int [][]A,int[][]B)
    {
        int r = A.length;
        int [][] mat1 = new int [r][r];
        // int c = mat[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                mat1[i][j] = 0;
                for(int k=0;k<r;k++)
                {
                    mat1[i][j] = mat1[i][j] +A[i][k]*B[k][j];
                }
            }
        }
        return mat1;
    }
    public static void main(String []args)
    {
        int[][]mat ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        }; 
        
        int[][] matB = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        mat = Mul(mat,matB);
        for (int[] row : mat) {
            // Iterate over each element in the row
            for (int element : row) {
                System.out.print(element + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
