// public class KthLargestElement {
//     public static int maxEle(int [] arr , int l )
//     {
//         int max = arr[0];
//         int n = arr.length;
//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]>max && max < l)
//             {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static int KthElement(int[]arr,int k)
//     {
//         int n = arr.length;
//         int [] index = new int[n];
//         int max  = maxEle(arr , Integer.MAX_VALUE);
//         int Kthmax = arr[0];
//         int c = 0 ;
//         //Kth max 
//         for(int i=0;i<k;i++)
//         {
//             if(arr[i]>Kthmax && arr[i]<max)
//             {
//                 Kthmax = arr[i];
//                 c++;
//             }
//             max = maxEle(arr, max) ; 
//         }
//         return Kthmax;
//     }
//     public static void main(String[] args) {
//         int []arr = {1,2,3,4,5,6,7,8};
//         int k = 4;
//         int m = KthElement(arr, k);
//         System.out.println(k+" th max ele is : "+m);
//     }
// }
public class KthLargestElement {
    public static int maxEle(int[] arr, int l) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && arr[i] < l) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int KthElement(int[] arr, int k) {
        int max = Integer.MAX_VALUE;
        int Kthmax = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            max = maxEle(arr, max);
            Kthmax = max;
        }
        return Kthmax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        int k = 3;
        int m = KthElement(arr, k);
        System.out.println(k + "th max element is: " + m);
    }
}
