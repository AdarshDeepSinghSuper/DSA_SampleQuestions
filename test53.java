public class test53 {
    public static void main(String[] args) {
        double a = 16.0; // The number to find the square root of
        double epsilon = 0.0001; // Error tolerance
        double guess = a / 2.0; // Initial guess
        
        // Iterate until the guess is close enough to the actual square root
        while (Math.abs(guess * guess - a) > epsilon) {
            guess = 0.5 * (guess + a / guess);
        }
        
        System.out.println("Square root of " + a + " is approximately: " + guess);
    }
}
