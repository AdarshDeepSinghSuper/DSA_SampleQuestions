public class LeetCode1572 {
    public static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum += mat[i][i];
        }
        int j = 0;
        for(int i=n-1;i>=0;i--)
        {
            // if(n%2!=0 && mat[j][i]==mat[j][j])
            // {
            //     continue;
            // }
            sum +=mat[j][i];
            j++;
        }
        if(n%2!=0)
        {
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        int s = diagonalSum(mat);
        System.out.println(s);
    }
}
