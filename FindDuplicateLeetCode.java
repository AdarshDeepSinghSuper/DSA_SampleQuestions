public class FindDuplicateLeetCode {
    public static int FindDuplicate(int []arr)
    {
        int n = arr.length;
        int DuplicateElement = 0 ;
        int []count = new int [n];
        for(int i=0;i<n;i++)
        {
            count[arr[i]]++;
            
        }
        for(int i=0;i<n;i++)
        {
            if(count[i]>1)
            {
                DuplicateElement = i ;
            }

        }
        return DuplicateElement;
        // for(int val:count)
        //     {
        //         System.out.print(val+" ");
        //     }
    }
    public static void main(String[] args) {
        int [] arr ={3,3,3,3,3};
        int d = FindDuplicate(arr);
        System.out.println(d);
    }
}
