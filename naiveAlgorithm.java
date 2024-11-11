public class naiveAlgorithm {
    public static void Search(String pat,String txt)
    {
        int m = pat.length();
        int n = txt.length();
        for(int i=0;i<=(n-m);i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(txt.charAt(i+j)!=pat.charAt(j))
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println("pattern found at index : "+i);
            }
        }
    }
    public static void main(String[]args)
    {
        String txt = "AABAACAADAABAABA";
        String pat = "AABA";
        Search(pat, txt);
    }
}
