public class LeetCode13 {
    public static int romanToInt(String s)
    {
        int n = s.length();
        int num = 0;
        for(int i=n-1;i>=0;i--)
        {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                num+=1;
                    break;
                case 'V':
                num+=5;
                if(i>0 && s.charAt(i-1)=='I')
                {
                    num-=1;
                    i--;
                }
                break;
                case 'X':
                num+=10;
                if(i>0 && s.charAt(i-1)=='I')
                {
                    num-=1;
                    i--;
                }
                break;
                case 'L':
                num+=50;
                if(i>0 && s.charAt(i-1)=='X')
                {
                    num-=10;
                    i--;
                }
                break;
                case 'C':
                num+=100;
                if(i>0 && s.charAt(i-1)=='X')
                {
                    num-=10;
                    i--;
                }
                break;
                case 'D':
                num+=500;
                if(i>0 && s.charAt(i-1)=='C')
                {
                    num-=100;
                    i--;
                }
                break;
                case 'M':
                num+=1000;
                if(i>0 && s.charAt(i-1)=='C')
                {
                    num-=100;
                    i--;
                }
                break;

            
                default:
                    break;
            }

        }
        
        return num;
    }
    public static void main (String[]args)
    {
        String s = "XXXV";
        int a = romanToInt(s);
        System.out.println(a);
    }
}
