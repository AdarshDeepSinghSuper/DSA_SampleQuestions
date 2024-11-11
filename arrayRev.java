public class arrayRev {
    public static void arrRev(int [] arr)
    {
        int n = arr.length-1;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        arrRev(arr);
        for(int val:arr)
        {
            System.out.print(val);
        }
    }
}
