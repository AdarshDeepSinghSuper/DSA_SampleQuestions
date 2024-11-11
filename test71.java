public class test71 {
    public static int [] freq(int []arr,int k)
    {
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int a = n/k;
        int [] ans = new int [n];
        int [] freq = new int [max+1];
        for(int i=0;i<n;i++)
        {
             freq[arr[i]]++;

        }
        int idx =0;
        for(int i=0;i<(max+1);i++)
        {
            if(freq[i]==a)
            {
                ans[idx]=i;
                idx++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,8,9};
        System.out.println(arr.length);
        int [] arr1 = freq(arr, 7);
        for(int val:arr1)
        {
            if(val>0)
            System.out.print(val+" ");
        }
    }
}
