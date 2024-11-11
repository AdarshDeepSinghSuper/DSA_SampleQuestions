class Solution {
    public boolean repeatedSubstringPattern(String s) {
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
        for(int val:lps)
        {
            if(val>1)
            {
                return true; 
            }
        } 
        // if((s.charAt(0)=='b')&&(s.charAt(1)=='b'))
        // {
        //     return true;
        // }
        int u =0;
        for(int val:lps)
        {
            if(val==0){
                u ++;
            }
            else{
                break;
            }
        }
        if((lps.length/2)<u)
        {
            return false;
        }
        // System.out.println("Longest repeated character is : "+u);
        if(lps[lps.length-1]==lps.length-u)
        {
            return true;
        }
        return false;
    }
}