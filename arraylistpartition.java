import java.util.*;
public class arraylistpartition {
    public static ArrayList<Integer> partition(ArrayList<Integer>integers)
    {
        int j =0 ;// for traversing through list
        int pivot = integers.get(0);
        int s = integers.size();
        ArrayList<Integer>arr = new ArrayList<Integer>();
        for(int i=0;i<s;i++ )
        {
            if((integers.get(i))<pivot)
            {
                arr.add(integers.get(i));
            }
        }
        for(int i=0;i<s;i++)
        {
            if((integers.get(i))==pivot)
            {
                arr.add(integers.get(i));
            }
        }
        for(int i=0;i<s;i++)
        {
            if((integers.get(i))>pivot)
            {
                arr.add(integers.get(i));
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayList<Integer>x = new ArrayList<Integer>();
        x.add(5);
        x.add(7);
        x.add(4);
        x.add(3);
        x.add(8);
        ArrayList<Integer>y=new ArrayList<>();
        y = partition(x);
        System.out.println(y);
    }
}
