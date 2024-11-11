public class cw {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,3};
        int l = arr.length;
        
        // Bubble sort
        for (int i = 0; i < (l - 1); i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        // Find duplicates
        boolean foundDuplicates = false;
        for (int i = 0; i < (l - 1); i++) {
            if (arr[i] == arr[i + 1]) {
                foundDuplicates = true;
                System.out.println("Duplicate found: " + arr[i]);
            }
        }
        
        if (!foundDuplicates) {
            System.out.println("-1");
        }
    }
}
