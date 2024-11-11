public class DSA2 {
    static void Segregate(int []arr)
    {
        int[]arr1 = new int[arr.length];
        int idx = 0;//index of new arr for counting filled numbers
        //for negative numbers
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                arr1[idx]=arr[i];
                idx ++;
            }
        }
        System.out.println(idx);
        //for positive numbers
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                arr1[idx] = arr[i];
                idx++;
            }
        }
        //copying elements to original array
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = arr1[i];
        }

    }
    //printing function
    static void display(int[]arr)
    {
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr = {19,-20,7,-4,-13,11,-5,3};
        Segregate(arr); 
        display(arr);
    }

}
