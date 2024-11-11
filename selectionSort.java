public class selectionSort {

    public static void Sort(int []arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //finding minimum element in array
            int min_idx = i;
            for(int j = i+1;j<n;j++ ){
                if(arr[j]<arr[min_idx]){
                    min_idx = j ;
                //Swaping 
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp; 
                }
            }
        }
    }
    //Printing array
    public static void Print(int []arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[ ] = {5,3,6,1,7,8,};
        Sort(arr);
        Print(arr);
    }

}
    