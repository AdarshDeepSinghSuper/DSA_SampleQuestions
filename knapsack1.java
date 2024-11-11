import java.util.Scanner;

public class knapsack1 {
    public static void sort(float[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][2] > arr[j][2]) {
                    // Swap profit-to-weight ratio
                    float temp = arr[i][2];
                    arr[i][2] = arr[j][2];
                    arr[j][2] = temp;
                    // Swap profit
                    temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                    // Swap weight
                    temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;
                }
            }
        }
    }

    public static float maxProfit(float[][] arr, int maxWeight) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            float PWratio = arr[i][0] / arr[i][1];
            arr[i][2] = PWratio;
        }
        // Sort items based on profit-to-weight ratio
        sort(arr);
        float remainingWeight = maxWeight;
        float totalProfit = 0;
        for (int i = 0; i < n; i++) {
            if (remainingWeight >= arr[i][1]) {
                // Include the entire item
                totalProfit += arr[i][0];
                remainingWeight -= arr[i][1];
            } else {
                // Include a fraction of the item
                totalProfit += (arr[i][0] * remainingWeight / arr[i][1]);
                break; // Knapsack is full
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items: ");
        int n = sc.nextInt();

        System.out.println("Enter max weight: ");
        int maxWeight = sc.nextInt();

        float[][] arr = new float[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter item " + i + " profit: ");
            float profit = sc.nextFloat();
            arr[i][0] = profit;

            System.out.println("Enter item " + i + " weight: ");
            float weight = sc.nextFloat();
            arr[i][1] = weight;
        }

        float maxProfit = maxProfit(arr, maxWeight);
        System.out.println("Maximum profit is: " + maxProfit);
    }
}
