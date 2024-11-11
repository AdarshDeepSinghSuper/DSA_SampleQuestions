public class IntegerToRoman {
    public static String IntToRoman(int num)
    {
        String s = "";
        if(num>1000)
        {
            while(true)
            {
                s = 'M'*(num%1000);
            }
        }
    }
}
