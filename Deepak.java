import java.util.*;
public class Deepak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of experienced players");
        int m = sc.nextInt();
        System.out.println("enter no of fresher players");
        int n = sc.nextInt();
        //input done!
        //total no of players 
        int t = m+n;
        if(m>1|n>1){
            int a = (m+n)/4;
            System.out.println("no of teams possible = ");
            System.out.println(a);
        }
        
    }
    
}
