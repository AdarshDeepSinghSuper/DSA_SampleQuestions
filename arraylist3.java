import java.util.ArrayList;
public class arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        System.out.println(list);
        //add elements in between 
        list.add(3,4);
        System.out.println(list);
        list.set(2,8);
        System.out.println();
        System.out.println(list);
    }
}
