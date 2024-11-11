public class linearsearch {
        public static int linearSearch(int[] arr, int target) {
            // Iterate through the array
            for (int i = 0; i < arr.length; i++) {
                // Check if the current element is equal to the target
                if (arr[i] == target) {
                    return i; // Target found, return the index
                }
            }
            return -1; // Target not found
        }
    
        public static void main(String[] args) {
            // Example usage:
            int[] myArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
            int targetElement = 6;
    
            int result = linearSearch(myArray, targetElement);
    
            if (result != -1) {
                System.out.println("Element " + targetElement + " found at index " + result + ".");
            } else {
                System.out.println("Element " + targetElement + " not found in the array.");
            }
        }
    }
    

