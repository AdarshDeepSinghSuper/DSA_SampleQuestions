public class rotateArray {
    public static void Rotate(int [] arr)
    {
        int n = arr.length;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
    }
public static void main (String[]args)
{
    int [] arr = {1,2,3,4,5,6,7,8,9};
    Rotate(arr);
    for(int val:arr)
    {
        System.out.print(val);
    }
}
}
