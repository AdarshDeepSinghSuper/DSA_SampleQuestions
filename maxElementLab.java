public class maxElementLab {
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
    public static int MinElement(int [] arr)
    {
        int n = arr.length;
        int min = arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static int Kmax(int [] arr)
    {
        int n = arr.length;
        int kmax = arr[0];
        int max = MaxElement(arr);
        int min = MinElement(arr);
        int max1 = arr[0];
        int [] index = new int [n];
        for(int i=0;i<n;i++)
        {
            if((arr[i]>max1)&& (arr[i]!=max))
            {
                max1 = arr[i];
            }
        } 
        return kmax;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,20};
        System.out.println("max element is : "+MaxElement(arr));
        System.out.println("min element is : "+MinElement(arr));
    }
}
