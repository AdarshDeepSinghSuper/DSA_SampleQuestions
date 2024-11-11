import java.util.Arrays;
public class kmp2 {

    public static void computeLPS(String pat, int[] LPS) {
        int len = 0;
        int M = pat.length();
        LPS[0] = 0;
        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                LPS[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = LPS[len - 1];
                } else {
                    LPS[i] = 0;
                    i++;
                }
            }
        }
    }

    public static int[] search(String pat, String txt) {
        int n = txt.length();
        int m = pat.length();
        int[] occurrences = new int[n]; // Maximum possible occurrences
        int count = 0; // Counter for occurrences
        int[] LPS = new int[m];
        computeLPS(pat, LPS);
        int i = 0, j = 0;
        while (i < n) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == m) {
                occurrences[count++] = i - m + 1; // for 1 based indexing
                j = LPS[j - 1];
            } else if (i < n && txt.charAt(i) != pat.charAt(j)) {
                if (j != 0) {
                    j = LPS[j - 1];
                } else {
                    i++;
                }
            }
        }
        // Trim the array to the actual number of occurrences found
        return Arrays.copyOf(occurrences, count);
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        int[] occurrences = search(pat, txt);
        if (occurrences.length == 0) {
            System.out.println("Pattern not found in the text.");
        } else {
            System.out.print("Pattern found at positions: ");
            for (int pos : occurrences) {
                System.out.print(pos + " ");
            }
            System.out.println();
        }
    }
}
