import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        //Printing array list
        System.out.println(list);
        //get elements
        int element = list.get(1);
        System.out.println(element);
    }
}
