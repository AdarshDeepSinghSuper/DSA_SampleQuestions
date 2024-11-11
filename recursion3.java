import java.util.Scanner;

public class recursion3 {
    public static void printnumb(int n) {
        int s = 0;
        printnumbHelper(n, s);
    }

    public static void printnumbHelper(int n, int s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }
        
        // Update s after the recursive call
        printnumbHelper(n - 1, s + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        printnumb(n);
    }
}
