// public class containerwithmostwater1 {
//     public static int max(int a,int b)
//     {
//         if(a>b)
//         {
//             return a;
//         }
//         return b;
//     }
//     public static int min(int a,int b)
//     {
//         if(a<b)
//         {
//             return a;
//         }
//         return b;
//     }
//     public static int maxArea(int [] arr)
//     {
//         int area =0;
//         int n = arr.length;
//         int i=0,j=n-1;
//         while(i<j)
//         {
//             int small = (min(arr[i],arr[j]));
//         if (small==arr[i])
//         {
//             do
//             {
//                 i++;
//             }
//             while(arr[i]<=small && i<j );
//         }
//         else
//         {
//             do
//             {
//                 j--;
//             }
//                 while(arr[j]<=small && j>i);
//         }
//         area = max(area,small*(j-i));
//         }
        
//         return area;
//     }
//     public static void main (String[]args)
//     {
//         int []arr = {1,8,6,2,5,4,8,3,7};
//         int y =  maxArea(arr);
//         System.out.println(y);
//     }
// }
public class containerwithmostwater1 {
    public static int maxArea(int[] arr) {
        int area = 0;
        int n = arr.length;
        int i = 0, j = n - 1;
        
        while (i < j) {
            int height = Math.min(arr[i], arr[j]);
            area = Math.max(area, height * (j - i));
            
            // Move the pointer corresponding to the smaller height
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return area;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = maxArea(arr);
        System.out.println(maxArea);
    }
}
