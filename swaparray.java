public class swaparray
{
    public static void swap(int [] arr)
    {
        int n = arr.length;
        // int count =0;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]==0)
        //     {
        //         count++;
        //     }
        // }
        int idx=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[idx]=arr[i];
                idx++;
            }
        }
        while(idx<n)
        {
            arr[idx]=0;
            idx++;

        }
    }
    public static void main(String[] args) {
        int []arr= {1,2,0,4,3,0,5,0};
        swap(arr);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}