public class test11 {
    public static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        
        // Check if the array is already sorted
        if (nums[low] < nums[high]) {
            return nums[low];
        }
        
        // Perform binary search
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is the minimum element
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            
            // Check if the right side of mid is unsorted
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else { // Otherwise, the left side of mid is unsorted
                high = mid;
            }
        }
        
        // The loop terminates when low == high, which points to the minimum element
        return nums[low];
    }
    public static void main(String [] args)
    {
        int[] arr ={11,13,15,17};
        int y = findMin(arr);
        System.out.println(y);
    }
}
