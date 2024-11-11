public class test16 {
    public static int Count(String s)
    {
        int count = 0;
        int a = 0, b = 0;
        int n = s.length();
        
        // Finding the index of the first 'A'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                a = i;
                break;
            }
        }
        
        // Finding the index of the last 'B'
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'B') {
                b = i;
                break;
            }
        }
        
        // Counting 'A's between the first 'A' and the last 'B'
        for (int i = a; i < b; i++) {
            if (s.charAt(i) == 'A') {
                count++;
            }
        }
        
        // Counting 'B's between the last 'B' and the first 'A'
        for (int i = b; i > a; i--) {
            if (s.charAt(i) == 'B') {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        String s = "CABAAXBYAA";
        int c = Count(s);
        System.out.println(c); // Expected output: 4
    }
}
