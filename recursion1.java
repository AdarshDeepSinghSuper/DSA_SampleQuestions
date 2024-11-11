public class recursion1 {
    public static void main(String[] args) 
    {
        recursion1 r = new recursion1();
        int a = r.sum(10);//calling
        System.out.println("Sum of first n naturam number is: "+a);
    }
    int sum(int s)
    {
        if(s>0)
        {
            return s+sum(s-1);//recursion
        }
        else
        {
            return 0;
        }
    }
    
}
