import java.util.ArrayList;
import java.util.Collections;
public class arraylist7 { 
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(0);
        list.add(3);
        list.add(2);
        System.out.println(list);
        //sorting ## import collection class
        Collections.sort(list); 
        System.out.println();
        System.out.println(list);
    }
}
