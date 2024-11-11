public class bubblesort1 {
    public static void main (String[]args){
        int arr[]={6,5,7,8,34,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[i+1]){
                //swap
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println("arr[i]");
        }
    }
    
}
