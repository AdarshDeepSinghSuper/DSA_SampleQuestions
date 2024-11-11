public class missingElement {
    public static int Search(int [] arr)
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        int [] count = new int[max+1];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++)
        {
            if(count[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int [] arr = {1, 9, 3, 6, 2, 5, 7, 8, 4};
        int y = Search(arr);
        if(y==-1)
        {
            System.out.println("There is no missing element ");
        }
        else{
            System.out.println("The missing element is : "+y);
        }
    }
}
