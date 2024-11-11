public class RotateImageLeetCode 
{     
    public static void Rotate(int[][]mat )
    {
        int n = mat.length;
        // transpose of matrix 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // reversing each row 
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<(n/2);j++)
        //     {
        //         int temp = mat[i][j];
        //         mat[i][j] = mat[i][n-j-1];
        //         mat[i][n-j-1] = temp;
        //     }
        // }
        //printing matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) 
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of 2-D square matrix : ");
        // int n = sc.nextInt();
        int [][] mat ={{1,2,3},{4,5,6},{7,8,9}}; //new int [n][n];
        Rotate(mat);
        
    }
 
}
