public class TwoSumLeetCode {
    public static int [] TwoSum(int [] nums,int target)
    {
       int n = nums.length;
       int [] op = new int[2];
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum = (nums[i]+nums[j]);
                if(sum==target)
                {
                    op[0]=i;
                    op[1]=j;
                   

                }
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int [] nums = {2,5,5,11};
        int target = 10;
        int [] result = TwoSum(nums, target);
        for(int val:result)
        {
            System.out.print(val+" ");
        }


        }
    }
    

