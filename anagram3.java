public class anagram3 {
    public static int sum(String s, int i, int j) {
        int sum = 0;
        for (int a = i; a <= j; a++) {
            sum += (s.charAt(a) - 'a'); // Subtract the ASCII value of 'a'
        }
        return sum;
    }

    public static void Anagram(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int si = 0; // starting index
        int ei = m - 1; // ending index
        int s2Sum = sum(s2, 0, m - 1); // sum of given sub array
        while (ei < n) {
            int matchSum = sum(s1, si, ei);
            if (s2Sum == matchSum) {
                System.out.println("Anagram found at : " + si + " to " + ei);
            }
            si++;
            ei++;
        }
    }

    public static void main(String[] args) {
        String s1 = "abaababdccddabab";
        String s2 = "dabb";
        Anagram(s1, s2);
    }
}
