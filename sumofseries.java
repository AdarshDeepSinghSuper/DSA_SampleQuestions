import java.util.*;
public class sumofseries {
    static Scanner sc = new Scanner(System.in);
    public static int power(int x,int y){
        int power = 1;
        for(int i=1;i<=y;i++){
            power = power*x;
        }
        return power;
    }
    public static void main(String[] args) {
        System.out.println("enter a number x");
        int x = sc.nextInt();
        System.out.println("enter a number y");
        int y = sc.nextInt();
        int sum = 1;
        for(int i=1;i<=y;i++){
            int a = power(x, i);
            sum = sum+a;
        }
        System.out.println("sum of series is: "+sum);
    }
}
