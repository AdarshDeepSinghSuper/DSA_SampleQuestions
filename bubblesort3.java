public class bubblesort3 {
    public static void Sort(int[]arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[]args)
    {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Original array:");
        printArray(arr);

        Sort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
