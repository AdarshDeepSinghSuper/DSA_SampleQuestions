 import java.util.*;
public class multidimarray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the matrix: rows,columns");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(r+" "+c);
        System.out.println("Enter elements of the matrix");
        //array declatation
        int matrix[][] = new int[r][c];
        //rows        
        for (int i=0;i<r;i++){
            //columns
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element you want to search");
        int x=sc.nextInt();
        //searching
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( x==matrix[i][j]){
            System.out.println("the element was found at "+i+","+j);
                }
            }
        }
    }
}

    

