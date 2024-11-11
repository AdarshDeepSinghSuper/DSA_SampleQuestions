public class leetcode121_1 {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i=1;i<n;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            else
            {
                maxProfit=Math.max(maxProfit,prices[i]-minPrice);
            }
        }
        // for(int i=0;i<n-1;i++)
        // {
        //     for(int j=1;j<n;j++)
        //     {
        //         if(prices[j]>prices[i])
        //         {
        //             diff = prices[j]-prices[i];
        //         }
        //         if(diff>maxdiff)
        //         {
        //             maxdiff = diff;
        //         }
        //     }
        // }
        return maxProfit;
    }
    public static void main (String[]args)
    {
        int [] prices = {3,2,6,5,0,3};
        int y = maxProfit(prices);
        System.out.println(y);
    }
}
