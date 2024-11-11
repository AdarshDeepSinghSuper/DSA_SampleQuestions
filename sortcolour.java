public class sortcolour {
    public static void sort(int []arr)
    {
        int n = arr.length;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                a++;
            }
            if(arr[i]==1)
            {
                b++;
            }
            if(arr[i]==2)
            {
                c++;
            }
        }
        System.out.println(a+" "+b+" "+c);
        System.out.println(n);
        int idx=0;
        for(int i=0;i<a;i++)
        {
            arr[idx] = 0;
            idx++;
        }
        for(int i=0;i<b;i++)
        {
            arr[idx] = 1;
            idx++;
        }
        for(int i=0;i<c;i++)
        {
            arr[idx] = 2;
            idx++;
        }

    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,2,1,1,1,0,0,2,1,};
        sort(arr);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
