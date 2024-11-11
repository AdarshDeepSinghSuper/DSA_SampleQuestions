public class missingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7};
        int n = arr.length+1;
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int val : arr) {
            sum2 += val;
        }
        int missingElement = sum1 - sum2;
        System.out.println("The missing element is: " + missingElement);
    }
}
