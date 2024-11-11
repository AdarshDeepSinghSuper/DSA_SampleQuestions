public class sample1 {
    //finding maximum element in array
    public static int max(int []arr){
        int max =-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static void basicCountSort(int []arr)
    {
        int max = max(arr);
        int [] count = new int [max+1];//initializing new array
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[k++] = i;
            }
        }
    }
    public static void display(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int [] arr = {1,1,2,2,3,3,4,5,6,7,8,9};
        basicCountSort(arr);
        display(arr);
}
}
//practce
