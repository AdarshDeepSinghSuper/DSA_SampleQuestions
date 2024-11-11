public class containerwithmostwater {
    public static int max(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        return b;
    }
    public static int min(int a,int b)
    {
        if(a<b)
        {
            return a;
        }
        return b;
    }
    public static  int maxArea(int[] height) {
        int n = height.length;
        int a =0;
        int b = n-1;
        int area = 0;
        int min = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
            min = min(height[i],height[j]);
            int c = (j-i)*min;
            area = max(area, c);
            }
            
        }
        System.out.println();
        return area ;
    }
    public static void main (String[]args)
    {
        int []arr = {1,1};
        int y =  maxArea(arr);
        System.out.println(y);
    }
}
// public int max(int a,int b)
// {
//     if(a>b)
//     {
//         return a;
//     }
//     return b;
// }
// public int min(int a,int b)
// {
//     if(a<b)
//     {
//         return a;
//     }
//     return b;
// }
// public int maxArea(int[] height) {
//     int n = height.length;
//     int a =0;
//     int b = n-1;
//     int area = 0;
//     int min = 0;
//     for(int i=0;i<n;i++)
//     {
//         for(int j=n-1;j>=0;j--)
//         {
//         min = min(height[i],height[j]);
//         int c = (j-i)*min;
//         area = max(area, c);
//         }
        
//     }
//     return area ;
