import java.util.ArrayList;
import java.util.List;

public class test9 {
       public static List<Integer> quickSort(List<Integer> arr) {
    // Write your code here
        int j =0 ;// for traversing through list
        int pivot = arr.get(0);
        int s = arr.size();
        List<Integer>arr1 = new List<Integer>();
        for(int i=0;i<s;i++ )
        {
            if((arr.get(i))<pivot)
            {
                arr1.add(arr.get(i));
            }
        }
        for(int i=0;i<s;i++)
        {
            if((arr.get(i))==pivot)
            {
                arr1.add(arr.get(i));
            }
        }
        for(int i=0;i<s;i++)
        {
            if((arr.get(i))>pivot)
            {
                arr1.add(arr.get(i));
            }
        }
        return arr1;

}
public static void main(String[] args) {
    List<Integer>x = new List<Integer>();
    x.add(5);
    x.add(7);
    x.add(4);
    x.add(3);
    x.add(8);
    List<Integer>y=new List<>();
    y = quickSort(x);
    System.out.println(y);
}
}
