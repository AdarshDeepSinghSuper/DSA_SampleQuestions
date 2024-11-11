public class SlidingWindow1 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 2, 9, 1};
        int n = arr.length;
        int k = 3; // window size
        int i = 0; // starting index
        int j = 0; // ending index
        int sum = 0;
        int max = 0;
        
        while (j < n) {
            sum = sum + arr[j];
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                max = Math.max(sum, max); // finding maximum sum
                sum = sum - arr[i]; // remove the element at i from the current sum
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
