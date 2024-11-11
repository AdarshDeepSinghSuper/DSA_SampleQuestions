public class leetcode_459_1 {
    public static boolean lps(String s )
    {
        int n = s.length();
        int i=1;
        int length = 0 ;
        int []arr = new int [n];
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(length))
            {
                length++;
                arr[i] = length;
                i++;
            }
            else
            {
                if(length!=0)
                {
                    length=arr[length-1];
                }
                else
                {
                    arr[i]=0;
                    i++;
                }
            }
        }
        int max = Integer.MAX_VALUE;
        for(int val:arr)
        {
            if(val>max);
            max=val;
        }
        if(max==1&&s.charAt(0)!=s.charAt(1))
        {
            return false;
        }
        if(n%max==0)
        {
            System.out.println(n%max);
            return true;
        }
        return false;
    }
    public static void main(String[]args)
    {
        String s = "abcabcabcabc";
        boolean a = lps(s);
        System.out.println(a);
    }
}
