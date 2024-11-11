public class BinarySearchLeetCode {
    public static int Search(int [] arr,int target)
    {
        int n = arr.length;
        int low =0;
        int high = n-1;
        
        while(low<=high)
        { 
        int mid = (low+high)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        else if(target<arr[mid])
        {
            high = mid-1;
        }
        else
        {
            low=mid+1;
        }
        }
        //if key not present 
        return -1 ;
    }
    public static void main(String[] args) {
        int [] arr = {-1,0,3,5,9,12};
        int k = Search(arr, 9);
        System.out.println(k);
    }
    
}
