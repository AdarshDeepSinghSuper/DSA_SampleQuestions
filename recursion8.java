public class recursion8 {
   public static int fun(int n)
   {
    if(n==4)
    {
        return n;
    }
    else{
        return 2*fun(n-1);
    }
   } 
   public static void main(String[] args) {
    int n = 3;
    int a = fun(n);
    System.out.println(a);
   } 
}
