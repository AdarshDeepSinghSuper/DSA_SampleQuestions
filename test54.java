public class test54 {
    public static void KMPstringMatch(String T,String P )
    {
        int n = T.length();
        int m = P.length();
        int q = -1;//no of characters matched
        int [] pi = CompPrefixFn(P,m);// initializing pi table array
        // pi = CompPrefixFn(P,m);//pi table function
        for(int i=0;i<n;i++)
        {
            while(q>-1 && (P.charAt(q)!=T.charAt(i)))
            {
                q = pi[q];
               
                
            }
            if(P.charAt(q+1)==T.charAt(i))
            {
                q = q+1 ; //if next character Matched
            }
            if(q==m)
                {
                    System.out.println("Pattern matched from "+i+" to "+i+m);
                }
        }
    }
    public static int[] CompPrefixFn(String P,int m)
    {
        int []arr = new int [m];//new array for substring 
        arr[1] = -1;
        int k = 0 ;
        for(int q=1;q<m;q++)
        {
            while(k>-1 && (P[k+1]!=P[q]))
            {
                k = arr[k];
                
            }
            if(P[k+1]==P[q])
                {
                    k = k+1;
                    arr[q] = k;
                }
        }

        return arr;
    }
    public static void main(String[] args) {
        String str = "bacbababaabcbab";
        String substr = "ababaca";
        KMPstringMatch(str, substr);
}
}
