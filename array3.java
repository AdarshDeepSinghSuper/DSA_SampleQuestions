import java.util.*;
public class array3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        System.out.println("enetr 6 elements in the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        //sorting the array 
        Arrays.sort(arr);
        //printing the array
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // int m = Math.min(arr[4],arr[2]);//
        // System.out.println("the minumun of "+arr[4]+" and "+arr[2]+" is : "+m);
        int sum = 0;
        for(int i=1;i<arr.length;i+=2)
        {
            sum += Math.min(arr[i],arr[i-1]);
        }
        System.out.println(sum);
    }
}