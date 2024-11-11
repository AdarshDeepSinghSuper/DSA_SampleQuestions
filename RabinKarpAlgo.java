import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RabinKarpAlgo {

    private static final int PRIME = 101;

    public static List<Integer> rabinKarp(String text, String pattern) {
        List<Integer> occurrences = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        int patternHash = calculateHash(pattern, m);
        int textHash = calculateHash(text.substring(0, m), m);

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash && text.substring(i, i + m).equals(pattern)) {
                occurrences.add(i);
            }
            if (i < n - m) {
                textHash = recalculateHash(text, i, m, textHash);
            }
        }

        return occurrences;
    }

    private static int calculateHash(String str, int length) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(PRIME, i);
        }
        return hash;
    }

    private static int recalculateHash(String text, int oldIndex, int length, int oldHash) {
        int newHash = oldHash - text.charAt(oldIndex);
        newHash /= PRIME;
        newHash += text.charAt(oldIndex + length) * Math.pow(PRIME, length - 1);
        return newHash;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = "ABABDABACDABABCABAB";
        String pattern = "ABABCABAB";

        List<Integer> occurrences = rabinKarp(text, pattern);
        if (!occurrences.isEmpty()) {
            System.out.print("Occurrences found at indices: ");
            for (int index : occurrences) {
                System.out.print(index + " ");
            }
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}
