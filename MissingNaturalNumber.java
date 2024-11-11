public class MissingNaturalNumber {
    public static int Search(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int y = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int N = n + 1;
        int sum1 = (N * (n + 1)) / 2;
        if (sum != sum1) {
            y = sum1 - sum;
        }
        return y;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int y = Search(arr);
        if (y == 0) {
            System.out.println("There is no missing element ");
        } else {
            System.out.println("The missing number is : " + y);
        }
    }
}
