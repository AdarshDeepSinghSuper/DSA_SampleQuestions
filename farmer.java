public class farmer {
    public static int cost(int l,int b)
    {
        int cost=1;
        cost = cost*(((l*2)*2)+(((b-2)*2)*2));
        return cost;
    }
    public static void main(String[] args) {
        int l=4;
        int b = 6;
        System.out.println(cost(l, b));
    } 
}
