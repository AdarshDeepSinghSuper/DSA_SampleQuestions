import java.util.*;
public class patel12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int n = sc.nextInt();
        System.out.print("Enter a number you want to search : ");
        int x = sc.nextInt();

        int remainder =0;
        int c = 0;
        while (n > 10) {
            remainder = n % 10;
            System.out.println("remainder is : "+remainder);
            if (remainder == x) {
                c += 1;
                
            }
            n = n / 10;
        }
        System.out.println(c);


    }
}



// public class count {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number:");
//         int n = sc.nextInt();
//         int c = 0;
//         while (n > 0) {
//              int remainder = n % 10;
//             if (remainder == 3) {
//                 c += 1;
//                 n = n / 10;
//             }
//         }
//         System.out.println(c);


//     }
// }