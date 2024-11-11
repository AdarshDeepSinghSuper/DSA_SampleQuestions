public class arrayduplicate {
    public static void main(String[]args){
        int arr[] = {1,2,3,3,4,4,5,5,6,6,7,8,9,10};
        int a[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                a[j] = arr[i];
                j++;
            }
        }
       a[j] = arr[arr.length - 1];
        for(int i=0;i<=j;i++){
            System.out.println(a[i]);
        }
    }
    
}
