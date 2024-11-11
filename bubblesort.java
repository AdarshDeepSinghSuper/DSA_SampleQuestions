public class bubblesort {
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[]args){
        int arr[] = { 9,8,7,6,5,5,3,56,3,6,2,5,4,3,2,1 };
        //bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        System.out.println("the sorted array is: ");
        printarray(arr);
    }
    
}
