public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        int missingNumber = totalSum - arrSum;
        return missingNumber;
    }
}
