public class Leetcode238 {
    public static int Product(int []arr,int p)
    {
        int n = arr.length;
        int Product = 1;
        if(p==0)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    continue;
                }
                Product*=arr[i];
            }
            return Product;
        }
        for(int i=0;i<n;i++)
        {
            Product*=arr[i];
        }
        return Product; 
    }
    public static int[] productExceptSelf(int[]arr)
    {
        int n = arr.length;
        int [] product = new int [n];
        int zeroCount = 0;
        for(int val:arr)
        {
            if(val==0)
            {
                zeroCount++;
            }
        }
        if(zeroCount>1)
        {
            return product;
        }
        int Product = Product(arr,1);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zeroCount++;
                product[i] = Product(arr,arr[i]);
                continue;
            }
            product[i] = Product/arr[i];
        }
        return product;
    }
    public static void main (String[]args)
    {
        int [] arr = {0,0};
        int [] arr1 = new int [arr.length];
        arr1 = productExceptSelf(arr);
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
    }
}
