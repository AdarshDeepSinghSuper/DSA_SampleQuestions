public class mini_maxSum_MergeSort {
        public static void divide(int arr[],int si,int ei){
            if(si>=ei){
                return;
            }
            int mid = si+(ei-si)/2;
            divide(arr, si, mid);
            divide(arr, mid+1, ei);
            conquer(arr,si,mid,ei);
        }
        public static void conquer(int arr[],int si,int mid,int ei){
            int merged[] = new int [(ei-si)+1];
            int indx1 = si;
            int indx2 = mid+1;
            int x = 0;
            while (indx1 <=mid && indx2 <=ei){
                if(arr[indx1] <= arr[indx2]){
                    merged[x++] = arr[indx1++];
                }
                else{
                    merged[x++] = arr[indx2++];
                }
            }
            while(indx1 <= mid){
                merged [x++] = arr[indx1++];
            }
            while(indx2 <= ei){
                merged [x++] = arr[indx2++];
            }
            for(int i=0,j=si;i<merged.length;i++,j++){
                arr[j] = merged[i];
            }
    
        }
        public static void main(String[] args) {
            int arr[] = {1,3,5,7,9};
            int n = arr.length;
            divide(arr,0,n-1);
            //print
            // for(int i=0;i<n;i++){
            //     System.out.print(arr[i]+" ");
            // }
            int minsum = 0;
            for(int i=0;i<4;i++)
            {
                minsum+=arr[i];
            }

            System.out.print("Minimum sum is : "+arr[0]+"+"+arr[1]+"+"+arr[2]+"+"+arr[3]+" = "+minsum);
        System.out.println();
        int maxsum = 0;
        for(int i=arr.length-1;i>arr.length-5;i--)
        {
            maxsum+=arr[i];
        }
        //int n = arr.length;
        System.out.print("Maximum sum is : "+arr[n-1]+"+"+arr[n-2]+"+"+arr[n-3]+"+"+arr[n-4]+" = "+maxsum);
        }
        
    
    
}
