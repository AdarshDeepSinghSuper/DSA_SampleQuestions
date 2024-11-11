import java.util.*;
public class arraysum {
    public static void main(String[]args){
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //DEFINING ARRAY
        int arr[] = new int[n];
        //TAKING INPUTN IN ARRAY
        for (int i=0;i<n;i++){
            System.out.println("enter element "+ i);
            arr[i]=sc.nextInt();
        }
        //PRINTING ARRAY
        System.out.println("The entered array is: ");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        //SUM OF ELEMENTS
        System.out.println("SUM OF ELEMENTS IS:");
        int sum = 0 ;
        for (int i=0;i<n;i++){ 
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
