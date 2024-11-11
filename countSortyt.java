public class countSortyt {
    //finding maximum element in array
    static int maxElement(int[]arr)
    {
        int max =-1;
        for(int i:arr)
        {
            if(i>max)
            {
                max = i;
            }
        } 
        return max;
    }
    //counting sort
    static void countingSort(int[]arr)
    {
        int max = maxElement(arr);
        int [] count = new int [max+1];
        for(int i=0;i<arr.length;i++)//for frequency array
        {
            count[arr[i]]++;
        }
        //printing sorted array
        for(int i=0;i<count.length;i++)
        {
            for(int j=0;j<count[i];j++)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[]args){
        int [] arr = {4,3,1,5,3,1,3,5,0,0,11,3,2,2};
        countingSort(arr);

    }
}
