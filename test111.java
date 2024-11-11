 public class test111 {
    public static boolean match(int[] arr, int[] arr1) {
        int n = arr.length;
        int m = arr1.length;
        
        // If lengths are different, arrays cannot be the same
        if (n != m) {
            return false;
        }
        
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr1[j]) {
                    found = true;
                    break;  // Break the inner loop once a match is found
                }
            }
            if (!found) {
                return false;  // If no match is found for arr[i], arrays are not the same
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 5};
        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 78};
        System.out.println(match(arr, arr1));  // Output will be false
    }
}
