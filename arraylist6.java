import java.util.ArrayList;
public class arraylist6 { 
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);
        // loops 
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
