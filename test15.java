public class test15{
        public static int reverse(int x) {
            int a = Integer.MAX_VALUE;
            if(x>a)
            {
                return 0 ;
            }
            int reversed = 0;
            while(x!=0)
            {
                int digit = x%10;
                x/=10;
                reversed = reversed*10+ digit;
            }
            return reversed;
            
        }
        public static void main(String[] args) {
            int a = 1534;
            int b = reverse(a);
            System.out.println(b);
            System.out.println(Integer.MAX_VALUE);
        }
}