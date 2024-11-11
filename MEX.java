public class MEX {
    public static int Find(int []arr)
    {
        int n = arr.length;
        int mex =0;
        int maxele = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxele)
            {
                maxele = arr[i];
            }
        }
        int [] count = new int [maxele+1];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=0)
            {
                count[arr[i]]++;
            }
            
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                mex = i;
                break;
            }

        }
        return mex;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 4};
        int y = Find(arr);
        System.out.println(y);
    }
}
