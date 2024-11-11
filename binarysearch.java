import java.util.*;
public class binarysearch {
    static int binarysearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key)
            return mid;
            else if(arr[mid]<key)
            low=mid+1;
            else
            high=mid-1; 
        }
        //if key is not present
        return -1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
         int arr[] = new int[n];
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to search");
        int key = sc.nextInt();
        int result=binarysearch (arr,key);
        if(result == -1){
            System.out.println("element was not found!!");
        }
            else
            System.out.println("element was found at " + result);
    }
}
