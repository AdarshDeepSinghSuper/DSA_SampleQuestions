import java.util.Scanner;
public class SearchInMatrix1 {
    static void matrixInput(int arr[][],int size)
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    static void search(int arr[][],int key)
    {
        int n = arr.length;
        boolean found = false;
        int j = n-1;
        int i = 0;
        while(j>=0 && i<n)
        {
            if(arr[i][j] == key)
            {
                System.out.println(i+" "+j);
                found = true;
                break;
            }
            else if (arr[i][j]>key)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        if(!found)
        {
            System.out.println("not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of square matrix");
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        System.out.println("enter elements of the matrix ");
        matrixInput(arr, n);
        System.out.println("Enter the element you want to search ");
        int key = sc.nextInt();
        search(arr, key);

    }
    
}
