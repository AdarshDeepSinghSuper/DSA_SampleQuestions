public class lab27aug {
    public static int[] match(int [] arr)
    {
        int n = arr.length;
        int [] res = new int [n];
        int index =0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==i)
            {
                res[index]=i;
                index++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,6,7,7};
        int [] arr1 = new int[arr.length];
        arr1 = match(arr);
        for(int val:arr1)
        {
            System.out.print(val+ " ");
        }
    }
}
