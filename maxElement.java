public class maxElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int max = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("maximum element is : "+max);
    }
}
