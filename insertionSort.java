public class insertionSort {
    public static void Sort(int [] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
    
    public static void main(String[] args) {
        int [] arr = {5, 4, 3, 2, 1};
        Sort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
