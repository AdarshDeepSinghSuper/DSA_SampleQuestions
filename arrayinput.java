import java.util.*;
public class arrayinput {
    public static void main (String []args){
        System.out.println("enter size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        //ARRAY DECLARATION
        int arr[] = new int[size];
        //TAKING INPUT
        for(int i=0;i<size;i++){
        System.out.println("enter element "+i);
            arr[i] = sc.nextInt();}
        //PRINTING ARRAY
        System.out.println("YOU HAVE ENTERED");
        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        
        }
    }
}