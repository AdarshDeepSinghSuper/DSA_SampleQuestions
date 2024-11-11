public class LPS {
    public static int[] Lps(String s)
    {
        int n = s.length();
        int [] lps = new int[n];
        int i=1;
        int length = 0;
        while(i<n)
        {
            if(s.charAt(i)==s.charAt(length))
            {
                length++;
                lps[i] = length;
                i++;
            }
            else{
                if(length!=0)
                {
                    length = lps[length-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return lps; 
    }
    public static void main(String[] args) {
        String s = "abcabcabcabc";
        int n = s.length();
        int [] arr = new int [n];
        arr = Lps(s);
        int u =0;
        
        for(int val:arr)
        {
            System.out.print(val);
        }
        System.out.println();
        for(int val:arr)
        {
            if(val==0){
                u ++;
            }
            else{
                break;
            }
        }
        double a = n/u;
        System.out.println("Decimal devision is : "+a);
        double b = Math.floor(a);
        System.out.println("Floor function is : "+b);
        double c = Math.ceil(a);
        System.out.println("Celling function is : "+c);
        if(b==c)
        {
            System.out.println("true");;
        }
        else
        {
            System.out.println("false");
        }

        // if((arr.length/2)<u)
        // {
        //     System.out.println("False");
        // }
        // System.out.println("Longest repeated character is : "+u);
        // if(arr[arr.length-1]==arr.length-u)
        // {
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("false");
        // }
        // if((arr.length/2)<u)
        // {
        //     System.out.println("False");
        // }
    }
}
