public class lab6march {
    //finding maximum element in array
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void BasicCountSort(int[] arr) {
        int max = max(arr);
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        System.out.println("Repeated elements:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void display(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9};
        BasicCountSort(arr);
    }
}

