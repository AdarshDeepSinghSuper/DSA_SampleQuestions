import java.util.Scanner;

public class hackerRanlkAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countSubstringsWithABC(s));
    }

    public static int countSubstringsWithABC(String s) {
        int n = s.length();
        int count = 0;

        // Iterate over all possible starting points of substrings
        for (int i = 0; i < n; i++) {
            boolean hasA = false, hasB = false, hasC = false;

            // Expand the substring from i to j
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);

                // Update flags based on the current character
                if (currentChar == 'a') hasA = true;
                if (currentChar == 'b') hasB = true;
                if (currentChar == 'c') hasC = true;

                // If all three characters are found, this substring is valid
                if (hasA && hasB && hasC) {
                    count++;
                }
            }
        }

        return count;
    }
}
