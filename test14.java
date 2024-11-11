import java.util.ArrayList;
public class test14 {
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //direction pointers
        int dir = 0;
        //assigning direction pointers
        int left = 0;
        int right = n-1;
        int bottom = m-1;
        int top = 0;
        // assigning Arraylist for result 
        ArrayList<Integer>result = new ArrayList<Integer>();
        //condition
        while(left<=right && top<=bottom)
        {
            if(dir == 0)
            {
                //left to right
                //constant : row:top
                for(int i=left;i<=right;i++)
                {
                    result.add(matrix[top][i]);
                }
                top++;
            }
            else if(dir == 1)
            {
                //top to down 
                // constant : column:right
                for(int i=top;i<=bottom;i++)
                {
                    result.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir == 2)
            {
                //right to left
                //constant : row : bottom 
                for(int i=right;i>=left;i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            else if(dir== 3)
            {
                //bottom to top
                //constant : column:left
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir+1) % 4;
        }
        return result;
    }
    public static void main(String[]args)
    {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer>spiral = new ArrayList<Integer>();
        spiral = spiralOrder(matrix);
        for(int i=0;i<spiral.size();i++)
        {
            System.out.print(spiral.get(i)+" ");
        }  

    }
}