import java.util.*;
public class magicnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a 3-digit number ,Digits must NOT REPEAT!!  ");
        int a = sc.nextInt();

        System.out.println("subtract the reverse of that number from itself ");
        int sub = sc.nextInt();
        //System.out.println("eg. 543-345=198 :");
        System.out.println("is result is -ve integet, ignore the minus sign ");
        //System.out.println("eg.349-943 = -594 ,ignote -ve sign : now result is: 594");
        int sub1 = sc.nextInt();
        System.out.println("now add the reverse of that number. eg. 594 + 495 ");
        int sub2 = sc.nextInt();
        System.out.println("now the result is : 1089");
        //System.out.println("Here is the calculation for your number");


    }
    
}
