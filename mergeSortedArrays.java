public class mergeSortedArrays {
    public static int [] merge(int []arr1,int []arr2)
    {
        int n = arr1.length;
        int m = arr2.length;
        int [] arr = new int [m+n];
        int i=0,j=0,a=0;

        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
            {
                arr[a] = arr1[i];
                i++;
                a++;
            }
            else
            {
                arr[a] = arr2[j];
                j++;
                a++;
            }
        }
        while(i<n)
        {
            arr[a]=arr1[i];
            i++;
            a++;
        }
        while(j<m)
        {
            arr[a]=arr2[j];
            j++;
            a++;
        }
        return arr;
    }
    public static void main (String[] args)
    {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8};
        int []arr = merge(arr1, arr2);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
}
