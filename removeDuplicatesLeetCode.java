public class removeDuplicatesLeetCode {
        public static int removeDuplicates(int[] nums) {
        int uniqueElement = 0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!= nums[uniqueElement])
            {
                uniqueElement++;
                nums[uniqueElement]=nums[i];//updating unique element
            }
        }
        return uniqueElement+1;
    }
    public static void main(String[] args) {
        int [] arr ={0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(arr);
        System.out.println(n);
    }
}
