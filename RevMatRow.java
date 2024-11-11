public class RevMatRow {
    public static void reverse(int [][] matrix)
    {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    public static void Print(int[][]mat)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
        {
                System.out.print(mat[i][j]);
        }        
        System.out.println();
    }
    }
    public static void main(String[]args)
    {
        int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        reverse(matrix);
        Print(matrix);
    }
}
