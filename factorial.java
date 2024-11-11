public class factorial {
    public static int calcfactorial(int n){
        if(n==1||n==0){
            return 1;
        }   
        int num1 = calcfactorial(n-1);
        int num2 = num1*n;
        return num2 ;     }
        public static void main(String[] args) {
            int n=5 ;
            int f = calcfactorial(n);
            System.out.println(f);
        }
    
}