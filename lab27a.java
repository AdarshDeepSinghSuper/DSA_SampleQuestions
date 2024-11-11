public class lab27a {
    public static int pllindrome(int [] arr)
    {
        int res =0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {

            int x = arr[i];
            int rev = 0;
            while(x!=0)
            {
                int digit = x%10;
                x = x/10;
                rev = rev*10+digit;
            }
            if(rev!=arr[i])
            {
                res =1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {121,323,444,565};
        int y = pllindrome(arr);
        System.out.println(y);
    }
}
