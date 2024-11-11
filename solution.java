class solution {
    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(nums[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int k = search(arr, 9);
        System.out.println(k);
    }
}