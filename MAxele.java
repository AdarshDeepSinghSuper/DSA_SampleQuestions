// public class MAxele {
//     public static int max(int [] arr)
//     {
//         int n = arr.length;
//         int max = arr[0];
//         for(int i = 0;i<n;i++)
//         {
//             if(arr[i]>max)
//             {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main (String[] args)
//     {
//         int arr[] = {1,2,3,4,5,6,7,7};
//         int y = max(arr);
//         y = (max(arr)&& y!= y);
//         System.out.println(y);
//     }
// }
import java.util.Arrays;

public class MAxele {
    public static int kthMax(int[] arr, int k) {
        int n = arr.length;
        if (k > n) {
            System.out.println("k is larger than the number of elements in the array.");
            return -1; // Error case
        }

        // Sort the array in descending order
        Arrays.sort(arr);

        // Return the k-th largest element (which is the (n-k)th element in the sorted array)
        return arr[n - k];
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 8, 7, 3, 6,7,7};
        int k = 2; // Example: finding the 3rd maximum element
        int y = kthMax(arr, k);
        if (y != -1) {
            System.out.println(k + "-th maximum element: " + y);
        }
    }
}
