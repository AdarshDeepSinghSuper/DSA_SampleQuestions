public class bubblesort1 {
    public static void main(String[] args) {
        int arr[] = {6, 5, 7, 8, 34, 4, 5, 6};
        int l = arr.length;
        for (int i = 0; i < (l - 1); i++) {
            for (int j = 1; j < l; j++) { // Iterate over the unsorted part
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Print the sorted array elements
        }
    }
}
