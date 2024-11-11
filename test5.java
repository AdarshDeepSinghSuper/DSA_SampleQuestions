public class test5 {
    public static void main(String[] args) {
        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n = mat.length;
        System.out.println(n);
        //printing
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        // transpose of matrix 
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
