public class peakElement {
    public static int findPeak(int [] arr)
    {
        int peak = arr[1];
        int n = arr.length;
        for(int i=1;i<n-2;i++)
        {
            if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1]))
            {
                peak = arr[i];
            }
        }
        return peak;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        System.out.println(findPeak(arr));
    }
}
