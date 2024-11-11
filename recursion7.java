public class recursion7 {
    public static int pow(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        else
        {
            return(a*pow(a,b-1));
        }
    }
    public static void main(String[] args) {
        int a = 2,b=4;
        int ans = pow(a,b);
        System.out.println(ans);
    }
}
