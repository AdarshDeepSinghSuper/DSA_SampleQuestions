public class TwoMissingNo {
    public static void Find(int []arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if((arr[i+1]-arr[i])>1)
            {
                System.out.println("the missing is : "+(arr[i]+1));
            }
        }
    }
    public static void main(String[] args) {
        int []arr ={1,2,3,4,6,8};
        Find(arr);
    }
}
