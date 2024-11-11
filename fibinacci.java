import java.util.Scanner;

public class fibinacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int n = scanner.nextInt();
        scanner.close();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series up to " + n + ":");
            int a = 0, b = 1;
            
            if (n >= 1) {
                System.out.print(a + " ");
            }
            
            if (n >= 2) {
                System.out.print(b + " ");
            }
            
            while (a + b <= n) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
