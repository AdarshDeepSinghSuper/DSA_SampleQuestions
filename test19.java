public class test19 {
    public static int MaxElement(int [] arr)
    {
        int n = arr.length;
        int max = arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int [] count(int []arr)
    {
        int n = arr.length;
        int m  = MaxElement(arr);
        int [] c = new int [m+1];
        for(int i=0;i<n;i++)
        {
                c[arr[i]]++;
            
        }
        return c;
    } 
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,3,4,4,4,5,5,6,6,7,7};
        int [] arr1 = count(arr);
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
    }
}
