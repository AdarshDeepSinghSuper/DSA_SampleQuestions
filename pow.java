public class pow {
    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1.0;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= x;
            }
            x *= x;
            n /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        double pow = myPow(0.00001, 2147483647);
        System.out.println(pow);
    }
}
