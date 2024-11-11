public class leetcode1813 {
    public static boolean simailar(String str1,String str2)
    {
        int g = str1.length();
        int h = str2.length();
        
            String[] s1 = str1.split(" ");
            String[] s2 = str2.split(" ");
        // if(h>g)
        // {
        //     String[] s1 = str2.split(" ");
        //     String[] s2 = str1.split(" ");
        // }
        
        int n = s1.length;
        int m = s2.length;
        int l1=0,l2=0;
        while(l1<n && l2<m && s1[l1].equals(s2[l2]))
        {
            l1++;
            l2++;
        }
        int r1 = n-1,r2=m-1;
        while(r1>=0 && r2>=0 && s1[r1].equals(s2[r2]))
        {
            r1--;
            r2--;
        }
        return r1>l1;
    }
    public static void main(String[] args) {
        String s1 = "UI wqhw Lf",   s2 =  "ezzXqqEQcS"; 
        System.out.println(simailar(s1, s2));
    }
}
