public class bubbleSort2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 7, 8, 9,45,55,66,77, 2, 4, 5, 6};
        int n = arr.length;
        System.out.println(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0;j<n;j++) {
                if (arr[i] > arr[j]) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Printing array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
