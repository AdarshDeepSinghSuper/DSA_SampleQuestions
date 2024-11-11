public class leetcode153 {
    public static int MinElement(int [] nums)
    {
        int r = Integer.MAX_VALUE;
        int n = nums.length;
        int low =0;
        int high = n-1;
        while(low<high)
        {
            int mid = nums.length/2;

            if(nums[mid]>nums[mid+1])   //comparing mid element with mid+1 
            {
                r =  nums[mid+1];
                break;
            }
            else if ( nums[mid] >nums[mid+1])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int []arr = {11,13,15,17};
        int y = MinElement(arr);
        System.out.println(y);
    }
}
