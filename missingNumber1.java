public class missingNumber1 {
    public static int search(int[] arr) {
        int n = arr.length + 1; // Including the missing number
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int missingNumber = search(arr);
        System.out.println("The missing number is: " + missingNumber);
    }
}
