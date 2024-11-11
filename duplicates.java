import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,4,5,2,4,5};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates in the array are: " + duplicates);
    }
}
