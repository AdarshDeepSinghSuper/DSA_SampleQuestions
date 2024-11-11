public class matrixRotation
{
    public static void Rotate(int[][]matrix)
    {
        int n = matrix.length;
        // finding matrix transpose
        for(int i=0;i<n;i++)
        {
            for(int j= i+1;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //reversing each row
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
    public static void printMat(int[][]matrix)
    {
        int n = matrix.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[]args)
    {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        printMat(matrix);
        System.out.println("Rotated matrix is : ");
        Rotate(matrix);
        printMat(matrix);
    }
}