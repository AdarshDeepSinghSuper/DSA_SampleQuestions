public class lab27b {
    public static boolean match(int []arr,int [] arr1)
    {
        int n = arr.length;
        int m = arr1.length;
        if(n!=m)
        {
            return false;
        }
        for(int i=0;i<n;i++)
        {
            boolean found =false;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr1[j])
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                return false;
            }
        }4
        return true;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        int [] arr1 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(match(arr, arr1));

    }
}
