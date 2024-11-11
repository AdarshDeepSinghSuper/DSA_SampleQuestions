public class array_Segragate {
    public static void main(String[] args) {
        int [] arr = {19,-20,7,-4,-13,11,-5,3};
        int n = arr.length;
        int [] Arr = new int [n];
        int k = 0 ;
        for(int val:arr)
        {
            if(val<0)   // for negative numbers 
            {
                Arr[k] = val;
                k++;
            }
        }
        for(int val:arr)
        {
            if(val>0)   // for positive numbers 
            {
                Arr[k] = val;
                k++;
            }
        }
        // printing array
        for(int val : Arr)
        {
            System.out.print(val+" ");
        }
    }
}
