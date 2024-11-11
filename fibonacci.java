public class fibonacci {
    public static void calcfib(int a , int b , int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        calcfib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0;System.out.println(a);
        int b = 1;System.out.println(b);
        int n = 5;
        calcfib(a, b, n);
    }
    
}
