import java.util.Scanner;
public class sqrt {
    public static int Sqrt(int x)
    {
        if(x==1||x==0)
        {
            return x;
        }
        int ans = 0;
        for(int i=1;i<=x/2;i++)
        {
            if(i*i <= x)
            {
                ans = i ;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        int ans = Sqrt(x);
        System.out.println("Sqare root is : "+ans);

    }
}
