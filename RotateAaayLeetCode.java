public class RotateAaayLeetCode {
    public static void Rotate(int [] arr,int k)
    {
       int n = arr.length;
        reverse(arr, 0, n-1);//reversing entire array 
        reverse(arr,0,k-1);// reversing upto k
        reverse(arr,k,n-1);//reversing remaining array
    }
    public static void reverse(int[]arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int [] arr ={1,2};
        //reverse(arr,0,arr.length-1);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        Rotate(arr, 2);
        System.out.println();
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
