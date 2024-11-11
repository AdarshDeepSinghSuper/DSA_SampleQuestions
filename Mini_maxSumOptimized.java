import java.util.*;

public class Mini_maxSumOptimized {
    // Method to find the maximum element in the array
    static int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    // Method to remove the maximum element from the array
    static void remove(int[] arr) {
        int max = maxEle(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = -1;
                break; // Exit loop after finding the first occurrence
            }
        }
    }

    // Method to print the array
    static void print(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    // Counting sort method
    static void countSort(int[] arr) {
        int maxElement = maxEle(arr);
        int[] count = new int[maxElement + 1];

        // Counting occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Reconstructing the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {1, 2, 400, 5, 6};
        remove(arr); // Remove the maximum element
        countSort(arr); // Sort the modified array
        print(arr); // Print the sorted array
    }
}
