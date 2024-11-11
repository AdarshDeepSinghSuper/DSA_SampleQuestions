public class test4 {
    public static void main(String[] args) {
        int a = 0;
        for(int i=0;i<100;i++)
        {
            System.out.println("adarsh");
            i--;
            for(int j=0;j<100;j++)
            {
                System.out.println("kriti");
                //j--;
                a++;
                if (a==Integer.MAX_VALUE)
        {
            break;
        }
            }
        }
        for(int i=0;i<100;i++)
        {
            System.out.println("kriti");
            i--;
            a++;
        }
        
    }
}
