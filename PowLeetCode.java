public class PowLeetCode {
    public static double myPow(double x, int n) {
        double pow = 1;
        if(n>0)
        { 
            for(int i=1;i<=n;i++)
            {
                pow = pow*x;
            }
            return pow;
        }
        else
        {
            int a = n*-1;
            for(int i=1;i<=a;i++)
            {
                pow = pow*(1/x);
            }
            return pow ;
        }
    }
    public static void main(String[] args) {
       double pow =  myPow(0.00001,2147483647);
       System.out.println(pow);
        
    }
}
