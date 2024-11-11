public class Leetcode_33 {
    public static int Search(int []nums,int target,int start, int end)
    {
        int n = nums.length;
        int low = start ;
        int high = end;
        while(low<high)
        {
            int mid = low+(high-low)/2;
            if(target==nums[mid])
            {
                return mid;
            }
            else if(target>mid)
            {
                low = mid+1;
            }
            else
            {

                high = mid;
            }
        }
        return -1;
    }
    public static int Search1(int []arr,int target,int start, int end)
    {
        int n = arr.length;
        
        while(start<end)
        {
            int mid = start+(end - start)/2;
            if((arr[mid]>arr[mid+1])&&(arr[mid]>arr[mid-1]))
            {
                if(target==arr[mid])
                {
                    return mid;
                }
                if(target>arr[start] && target<arr[mid]){
                    int result = search(arr,target,start,mid);
                    return search;
                }
            }
        }
    }
}
