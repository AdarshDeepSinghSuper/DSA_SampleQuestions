public class pallindrome {
    public static boolean checkPallindrome(String s)
    {
        int count = 0;
        int n = s.length();
        for(int i=0;i<(n/2);i++)
        {
            if(s.charAt(i)==s.charAt((n-i)-1))
            {
                count++;
            }
        }
        if(count == n/2)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "ADBBDA";
        boolean C = checkPallindrome(s);
        System.out.println(C);
    }
    
}
