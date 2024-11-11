public class DiaginalSum {
    static int sum(int matrix[][])
    {  
        int leftsum = 0;
        int r = 0;
        int c = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            leftsum += matrix[r][c];
            r++;
            c++;
        }
        
        int r1 = 0;
        int c1 = matrix[0].length - 1;
        int rightsum = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            rightsum += matrix[r1][c1];
            r1++;
            c1--;
        }
        
        int difference = (leftsum - rightsum);
        return difference;
    }
    
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{9,8,9}} ;
        int diff = sum(matrix);
        System.out.println("Diagonal Difference is : " + diff);
    }
}
