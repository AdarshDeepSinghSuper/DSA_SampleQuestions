public class wordRev {
    public static void Reverse(String str)
    {
        int n = str.length();
        char[]arr = new char [n];
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i) == ' ')
            {
                int a = i ;
                int b=0;
                for(int j=n-i-1;j<n;j++)
                {
                    arr[j]=str.charAt(b);
                    b++;
                }
            }
        }
        for(char val:arr)
        {
            System.out.print(val);
        }

    }
    public static void main(String[] args) {
        String str = "I am going to Dehli";
        Reverse(str);
    }
}
