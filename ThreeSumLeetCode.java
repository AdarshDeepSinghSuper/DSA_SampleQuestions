public class ThreeSumLeetCode {
    public static int [] Sums(int[] nums)
    {
        int [] sums = new int [3];
        int n = nums.length;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0)
                    { 
                    sums[0]=nums[i];
                    sums[1]=nums[j];
                    sums[2]=nums[k];
                    }
                    else
                    {
                        return sums;
                    }
                }
            }
        }
        return sums;
    }
    public static void main(String[] args) {
        int [] arr ={-1,0,1,2,-1,-4};
        int [] arr1 = Sums(arr);
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }

    }
}
