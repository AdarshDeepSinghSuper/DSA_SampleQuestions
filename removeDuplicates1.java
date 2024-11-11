import java.util.HashSet;
import java.util.Set;
public class removeDuplicates1 {
    public static int[] remove(int [] arr )
    {
        Set<Integer>duplicates = new HashSet<>();
        for(int val:arr)
        {
            duplicates.add(val);
        }
        // int i=0;
        // for(int items:duplicates)
        // {
        //     arr[i] = items;
        //     i++;
        // }
        int n = duplicates.size();
        int [] arr1 = new int [n];
        int i=0;
        for(int val:duplicates)
        {
            arr1[i] = val;
            i++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,3,4,4,4};
        int []arr1 =  remove(arr);
        for(int val:arr1)
        {
            System.out.print(val+" ");
        }
    }
}
