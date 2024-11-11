import java.util.Scanner;

public class recursion6 {
    public static int a = 1;

    public static void SumNumbers(int n , int sum){
        if(n==0){
            System.out.println("sum = "+sum);
            return ;
        } 
        sum += a;
        a++;
        SumNumbers(n-1 , sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        SumNumbers(n,0);
    }
    
}
