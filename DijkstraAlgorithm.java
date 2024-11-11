import java.util.Scanner;
import java.util.Arrays;
public class DijkstraAlgorithm {
    public static int[] shortestPath(int [][] mat,int source)
    {
        int n = mat.length;
        int z = Integer.MAX_VALUE;
        int []distant = new int [n];
        boolean[] visited = new boolean [n];// for tracking if we have visited or not
        Arrays.fill(distant,Integer.MAX_VALUE);
        distant[source] = 0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                int a = mat[i][0];
                if(mat[i][j]<a && mat[i][j]!=z)
                {
                    {
                        arr[i] = a;
                    }
                    if 
                }
                
            }
        }
        return arr;
    }
    public static void main (String[]args)
    {
    Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of ajacency matrix : ");
        // int n = sc.nextInt();
        // int [][] matrix = new int [n][n];
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.println("enter the "+i+" row and "+j+" column : ");
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }
        int z = Integer.MAX_VALUE;
        int [][] matrix  = {{0,5,1,z,z},{z,0,z,z,2},{z,3,0,8,3},{z,z,z,0,z},{z,z,z,5,0}};
        int []arr = new int[matrix.length];
        arr = shortestPath(matrix);
        // printing the array 
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
