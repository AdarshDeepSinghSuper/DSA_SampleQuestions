public class Q8LeetCode {

    public static int myAtoi(String s) {
        int n = s.length();
        StringBuilder word = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch == 45)
            {
                word.append(s.charAt(i));
            }
            if((int)ch>47 && (int)ch<58)
            {
               word.append(s.charAt(i));
            }
        }
        int intValue = Integer.parseInt(word.toString());
        return intValue;
    }
    public static void main(String[] args) {
        String s = "I am going 987 delhi";
        int y = myAtoi(s);
        System.out.println(y);
    }
}
