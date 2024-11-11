import java.util.Scanner;

public class KnuthMorrisPratt {
    public static void KMPstringMatch(String T, String P) {
        int n = T.length();
        int m = P.length();
        int q = -1; // no of characters matched
        int[] pi = CompPrefixFn(P, m); // pi table function
        for (int i = 0; i < n; i++) {
            while (q > -1 && P.charAt(q + 1) != T.charAt(i)) {
                q = pi[q];
            }
            if (P.charAt(q + 1) == T.charAt(i)) {
                q = q + 1; // if next character Matched
            }
            if (q == m - 1) {
                System.out.println("Pattern matched from " + (i - m + 1) + " to " + i);
                q = pi[q];
            }
        }
    }

    public static int[] CompPrefixFn(String P, int m) {
        int[] pi = new int[m]; // Create the prefix table
        pi[0] = -1;
        int k = -1;
        for (int q = 1; q < m; q++) {
            while (k >= 0 && P.charAt(k + 1) != P.charAt(q)) {
                k = pi[k];
            }
            if (P.charAt(k + 1) == P.charAt(q)) {
                k = k + 1;
            }
            pi[q] = k;
        }
        return pi;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter a substring : ");
        String substr = sc.nextLine();
        // String str = "bacbababaabcbab";
        // String substr = "aba";
        KMPstringMatch(str, substr);
    }
}
