import java.util.*;
public class classwork {
    public static void printarray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int []arr = {0,0,1,2,4,5,2,4,5};
        int l = arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
            if(arr[i]>arr[j]){
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
        
    }
}
