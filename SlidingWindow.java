// public class SlidingWindow {
//     public static void main(String[] args) {
//         int []arr = {1,2,3,4,5,6,7};
//         int n = arr.length;
//         int sum = 0;
//         int maxSum = -1;
//         for(int i=0;i<n;i++)
//         {
//             for(int j=i;j<i+3;j++)
//             {
//                 sum += arr[j];
//                 if(sum>18)
//                 {
//                     break;
//                 }
//             }
//             System.out.println(sum);
//             if(maxSum<sum)
//             {
//                 maxSum=sum;
//             }
//             sum = 0;
//         }
//         System.out.println("max Sum is : "+maxSum);
//     }
// }
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Window size
        int n = arr.length;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible value

        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = Math.max(maxSum, sum); // Update maxSum

        // Calculate sum of remaining windows using sliding window technique
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k]; // Slide the window by adding next element and subtracting the first element
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println("max Sum is : " + maxSum);
    }
}
