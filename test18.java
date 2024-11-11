public class test18 {
    public static int  fun(int n)
    {
        for(int i=2;i*i<1000;i++)
        {
            if(n%i==0)
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = 6;
        
    }
}
