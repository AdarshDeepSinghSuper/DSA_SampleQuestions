public class leetcode121 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int d = 0;//max difference
        int s = prices[0];
        int idx = 0;//index of smallest element
        for(int i=0;i<n;i++)
        {
            if(prices[i]<s && i!= n-1)
            {
                s = prices[i];
                idx = i;
            }
        }
        for(int i=idx+1;i<n;i++)
        {
            if(prices[i]>s)
            {
                int diff = prices[i]-s;
                if(diff>d)
                {
                    d = diff;
                }
            }
        }
        return d;
    }
}
