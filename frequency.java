public class frequency {
    public static int[] freq(int [] arr)
    {
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int [] freq = new int [max+1];
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,8};
        int [] arr1 = freq(arr);
        int a = 0 ;
        for(int val:arr1)
        {
            System.out.println(a+" has frequency : "+val +" ");
            a++;
        }
    }
}
