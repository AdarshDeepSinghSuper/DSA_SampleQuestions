public class DSA1 {
    static void SortArr(int[] arr)
    {
        int n = arr.length;//checking corner cases
        if(n<=1)
        {
            return ;
        }
        int x=-1,y=-1;
        //comparing adjecent elements
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>arr[i])
            {
                if(x==-1)//first conflict
                {
                    x = i-1;
                    y = i;
                }
                else
                {
                    y = i;
                }
            }
        }
        //swap
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    //printing array
    static void display(int[]arr)
    {
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
        int[]arr = {10,5,6,7,8,9,3};
        System.out.print("Prev Array is : ");
        display(arr);
        SortArr(arr);
        System.out.print("Sorted Array is : ");
        display(arr);
    }
}
