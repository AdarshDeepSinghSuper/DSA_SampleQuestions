public class armStrongnumber {
    static void isArmStrong(int a )
    {
       int h =  a/100;
       int t = (a%10)/10;
       int o = a%10;
    //    int arm = Math.pow(h,3)+Math.pow(t,3)+Math.pow(o,3);
       if(a==arm)
       {
        System.out.println("the given number is armstrong");
       }
    }
    public static void main(String[] args) {
    isArmStrong(153);
    }
}
