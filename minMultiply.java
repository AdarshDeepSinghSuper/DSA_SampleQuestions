import java.util.Scanner;
public class minMultiply {
    public static int product(int a,int n)
    {
        int ans = 1;
        int i=1,j=1;
        while(n>0)
        {
            if(n%2==1)
            {
                ans *= a;
            }
            System.out.println("Value of a in "+ i +" iteration : "+a);
            a *=a;
            i++;
            System.out.println("Value of n in "+j+" iteration : "+n);
            n/=2;
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = sc.nextInt();
        System.out.println("Enter n  ");
        int n = sc.nextInt();
        int ans = product(a, n);
        System.out.println("answer is : "+ans);
    }
}
