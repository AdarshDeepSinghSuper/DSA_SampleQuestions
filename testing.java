public class testing {
    public static void main (String[]args){ 
    
        int [] nums1 = {1,2};
        int [] nums2 = {3,4};
    int n = nums1.length;
    int m = nums2.length;
       int [] arr = new int[m+n];
       int left = 0;
       int right = 0;
       int index =0;
       while(left<n && right<m)
       {
        if(nums1[left]<=nums2[right])
        {
            arr[index] = nums1[left];
            index++;
            left++;
        }
        else
        {
            arr[index] = nums2[right];
            index++;
            right++;
        }
       }
       while(left<n)
       {
        arr[index++]=nums1[left++];//for copying remaining elements from nums1
        // index++;
        // left++;
       }
       while(right<m)
       {
        arr[index++] = nums2[right++];//for copying remaining elements form nums2
        // index++;
        // right++;
       }
       // printing merged array
       for(int val:arr)
       {
        System.out.print(val+" ");
       }
       //Calculating median
       double median = 0;
       int o = m+n;
       if(o%2 != 0)
       {
        System.out.println("Odd");
            median = arr[o/2];
       }
       else
       {
        int a = arr[o/2];
        int b = arr[o/2-1];
        double c = (a+b)/2.0;
        median = c;
       }
       System.out.println();
       System.out.println(median);
    }
}

