public class recursion5 {
    public static void Printnumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        Printnumb(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        Printnumb(n);
    }
    
}
