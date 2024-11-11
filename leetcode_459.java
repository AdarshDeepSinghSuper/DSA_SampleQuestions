public class leetcode_459 {
    public static int [] Lps(String s)
    {
        int n = s.length();
        int[] lps = new int [n];
        int length = 0 ;
        int i=1;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(length))
            {
                length++;
                lps[i]=length;
                i++;
            }
            else
            {
                if(length!=0)
                {
                    length = lps[length-1];
                }
                else
                {
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps;
    }
    public static void main (String[]args)
    {
        String s = "abcabcabcabc";
        int [] arr = new int [s.length()];
        arr = Lps(s);
        for(int val : arr)
        {
            System.out.print(val);
        }
    }
}
