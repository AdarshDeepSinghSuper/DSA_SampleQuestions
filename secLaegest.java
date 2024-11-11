public class secLaegest {
    public static int secLargest(int []arr)
    {
        int n = arr.length;
        int max=Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                secmax = max;
                max=arr[i];
            }
            else if (arr[i]>secmax && arr[i]!= max)
            {
                secmax = arr[i];
            }
            // if((arr[i]>secmax) && (secmax!=max))
            // {
            //     secmax = arr[i];
            // }
        }
        return secmax;
    }
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 1, 2};
        System.out.println(secLargest(arr));
    }
}
