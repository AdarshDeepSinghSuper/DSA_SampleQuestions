public class binarySearchPq {
    public static int Search(int arr[] ,int target,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid = (start+(end-start))/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(target>arr[mid])
        {
            return Search(arr,target,mid+1,end);
        }
        else
        {
            return Search(arr,target,start,mid);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,66,77};
        int n = arr.length;
        System.out.println(Search(arr,4,0,n));
    }
}
