public class mini_maxSum {
    static int maxEle(int [] arr) {
        int M = -1;
        for(int val:arr) {
            if(val>M) {
                M = val;
            }
        }
        return M;
    }

   public static void countsort(int []arr) {
        int [] count = new int [maxEle(arr)+1];
        
        // frequency matrix
        for(int i=0;i<arr.length;i++) {
            count[arr[i]]++;
        }
        
        int k = 0; // index for the sorted array
        
        // Copying sorted array to original array 
        for(int i=0;i<count.length;i++) {
            for(int j=0;j<count[i];j++) {
                arr[k++] = i; 
            }
        }
    }
    
    static void print(int []arr) {
        for(int val:arr) {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,6,1,2,8,3};
        countsort(arr);
        //minimum sum is 
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
        int n = arr.length;
        System.out.print("Maximum sum is : "+arr[n-1]+"+"+arr[n-2]+"+"+arr[n-3]+"+"+arr[n-4]+" = "+maxsum);

        //print(arr);
    }
}
