public class Leetcode_238 {
    public static int[] productExceptSelf(int nums[])
    {
        int n = nums.length;
        int [] result = new int [n];
        for(int i=0;i<n;i++)
        {
            result[i] = 1;
        } 
        int prefix = 1;
        for(int i=0;i<n;i++)
        {
            result[i]= prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for(int i=n-1;i>=0;i--)
        {
            result[i] *= postfix;
            postfix *=nums[i];
        }
        return result;
    }
    public static void main(String[]args)
    {
        int []arr = {1,2,3,4};
        int[] result = new int [arr.length];
        result = productExceptSelf(arr);
        for(int val:result)
        {
            System.out.print(val+" ");
        }
    }
}
//PREVIOUS SOLUTION
// class Solution {
//     public static int Product(int []arr,int p)
//     {
//         int n = arr.length;
//         int Product = 1;
//         if(p==0)
//         {
//             for(int i=0;i<n;i++)
//             {
//                 if(arr[i]==0)
//                 {
//                     continue;
//                 }
//                 Product*=arr[i];
//             }
//         }
//             return Product;
//     }
//     public int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//         int [] product = new int [n];
//         int Product = 1;
//         int zeroCount =0;
//         for(int val:nums)
//         {
//             if(val==0)
//             {
//                 zeroCount++;
//             }
//         }
//         if(zeroCount>1)
//         {
//             return product;
//         }
//         for(int i=0;i<n;i++)
//         {
//             Product*=nums[i];
//         }
//         for(int i=0;i<n;i++)
//         {
//             if(nums[i]==0)
//             {
//                 product[i] = Product(nums,nums[i]);
//                 continue;
//             }
//             product[i] = Product/nums[i];
//         }
//         return product;
//     }
// }