import java.util.Scanner;

public class test10 {
    public static int[] search(String str, String pat) {
        int[] index = {-1, -1}; // Initialize with invalid indices
        int i = 0;
        int j = 0;
        int n = str.length();
        int m = pat.length();
        while (i < n) {
            if (str.charAt(i) == pat.charAt(j)) {
                if (j == m - 1) {
                    index[0] = i - j; // Starting index of the substring
                    index[1] = i; // Ending index of the substring
                    break; // Found the substring, exit loop
                }
                j++;
            } else {
                j = 0; // Reset j if characters don't match
            }
            i++;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter a substring you want to search:");
        String pat = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity
        int[] y = search(str.toLowerCase(), pat); // Convert to lowercase for case-insensitivity
        if (y[0] == -1) {
            System.out.println("Substring not found.");
        } else {
            System.out.println("Starts at: " + y[0]);
            System.out.println("Ends at: " + y[1]);
        }
    }
}
