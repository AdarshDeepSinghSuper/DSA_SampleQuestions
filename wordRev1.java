public class wordRev1 {
    public static void Reverse(String str) {
        int n = str.length();
        char[] arr = new char[n];
        int start = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                int end = i;
                reverseWord(str, start, end - 1, arr);
                start = end + 1;
            }
        }

        // Handle the last word
        reverseWord(str, start, n - 1, arr);

        for (char val : arr) {
            System.out.print(val);
        }
    }

    private static void reverseWord(String str, int start, int end, char[] arr) {
        int index = 0;
        for (int i = end; i >= start; i--) {
            arr[index++] = str.charAt(i);
        }
        arr[end - start + 1] = ' '; // Add space after the reversed word
    }

    public static void main(String[] args) {
        String str = "I am going to Delhi";
        Reverse(str);
    }
}
