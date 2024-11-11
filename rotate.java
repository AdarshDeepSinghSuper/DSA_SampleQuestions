public class rotate {
    public static int[] Rotate(int [] arr,int k)
    {
        int n = arr.length;
        int []arr1 = new int [n];
        for(int i=k,a=0;i<n+k;i++,a++)
        {
            arr1[a] = arr[i%n];
        }
        return arr1;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8};
        int k = 3;
        int []arr1 = Rotate(arr, k);
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
    }
}
