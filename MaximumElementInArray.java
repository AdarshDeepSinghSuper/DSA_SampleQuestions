public class MaximumElementInArray {
    public static void main(String[] args) {
        int arr[]={2,3,1,2,3,5,7,8,9};
        int n = arr.length;
        int max = -1;
        for(int i=0;i<n;i++){
            if (max < arr[i]){ 
            max = arr[i];
            }
        
        System.out.println(max);
    }
}
