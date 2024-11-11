public class leetCode567 {
    public static boolean permutation(String s1, String s2)
    {
        int n = s1.length();
        int m = s2.length();
        //calculating sum using hash function
        // s1.chatAt(i)%7+s1.
        int sumS1 = 0;
        int sumS2 = 0;
        for(int i=0;i<n;i++)
        {
            sumS1 += s1.charAt(i)%7;
            sumS2 += s2.charAt(i)%7;
        }
        for(int i=0;i<m-n;i++)
        {
            if(sumS1 == sumS2)
            {
                return true;
            } 
            sumS2 = sumS2-(s2.charAt(i)%7)+(s2.charAt(i+n)%7);
        }

        return false;
    }
    public static void main(String[]args)
    {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(permutation(s1, s2));
    }
}
