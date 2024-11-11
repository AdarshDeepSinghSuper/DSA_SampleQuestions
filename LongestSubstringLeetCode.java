public class LongestSubstringLeetCode {
    public static int LongestSubstring(String s )
    {
        int l = 1;
        int n = s.length();
        int a = 1 ;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(0)==s.charAt(i))
            a = i;
        }
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(s.charAt(i) != s.charAt(j))
        //         {
        //             l++;
                
        //         }
        //     }
        // }

        return a;
    }
    public static void main(String[] args) {
        String s = "pwwkew";
        int n = LongestSubstring(s);
        System.out.println(n);
    }
}
