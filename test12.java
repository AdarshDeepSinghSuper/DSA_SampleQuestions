public class test12 {
    public static void naiveAlgo(String s,String pat)
    {
        int m = s.length();
        int n = pat.length();
        
        for(int i=0;i<=m-n;i++)
        {
            int j;
            for(j=0;j<n;j++)
            {
                if(s.charAt(i+j) != pat.charAt(j))
                {
                    break;
                }
            }
            if(j==n)
            {
                System.out.println("pattern found at index : "+i);
            }
        }

    }
    public static void main(String[] args) {
        String s = "abcdabcabcdf";
        String pat = "abcdf";
        naiveAlgo(s, pat);
    }
}
