public class ZigZagConversionLeetCode {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int row = 3;
        int col = (s.length())/2;
        char [][]arr = new char[row][col];
        //filling the elements;
        int k = 0; // for traversing through string 
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                if (k==s.length())
                {
                    break ;
                }
                arr[j][i] = s.charAt(k);
                
                k++;
            }
        }
        //Printing the array 
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                char a = arr[i][j];
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
