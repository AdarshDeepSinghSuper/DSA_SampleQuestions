public class foreachloop {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,0};
        int j = 0;
        for(int i:arr)
        {
            System.out.print(i+" "+ j++ +",");
        }
    }
}
