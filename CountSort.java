public class CountSort {
    //Function for finding maximum element 
    public static int max(int[] arr){
        int max = -1;
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
        int m = max(arr);//calling max function
        int [] count = new int [m+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++ ;
        }
        int k = 0;
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                arr[k++] = i;
            }
        }

    }
    static void display(int[]a)
    {
        for(int val:a)
        {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,5,2,2,5};
        basicCountSort(arr);
        display(arr);
    }
    
}
