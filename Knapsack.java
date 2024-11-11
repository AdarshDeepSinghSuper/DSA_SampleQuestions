import java.util.Scanner;
public class Knapsack {
    public static void sort(float[][]arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i][2]<arr[j][2])
                {
                    //swap 
                    float temp = arr[i][2];
                    arr[i][2] = arr[j][2];
                    arr[j][2] = temp;
                    //swapping profit
                    float temp1 = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp1;
                    //swapping weight
                    float temp2 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp2;

                }
            }
        }
    }
    public static float Maxprofit(float [][]arr,int Maxweight)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            float PWratio = arr[i][0]/arr[i][1];
            arr[i][2] = PWratio;
        }
        //now sort them according to p/w ratio
        sort(arr);
        float M = Maxweight;
        float Wi = 0;//weight of i th product
        float Pi = 0;//profit of i th product
        float P = 0;//total profit
        for(int i=0;i<n;i++)
        {
            // if(M < arr)
            if(M>0 && Wi<=M)
        { 
            M = M-arr[i][1];
            P = P+arr[i][0];
        }
        else
        {
            break;
        }
        if(arr[i][1]>M)
        {
            P = P+(arr[i][0]*(M/arr[i][1]));
        }


        }
        return P;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of items : ");
        int n = sc.nextInt();

        System.out.println("Enter max weight : ");
        int maxWeight = sc.nextInt(); 
        float [][]arr = new float [n][3];
        for(int i = 0;i<n;i++)
        {
            System.out.println("Enter item "+i+" profit : ");
            int a = sc.nextInt();
            arr[i][0] = a;
            System.out.println("Enter item "+i+" weight : ");
            int b = sc.nextInt();
            arr[i][1] = b;
        }
        float y = Maxprofit(arr,maxWeight);
        System.out.println("Maximum profit is : "+y);
         
    }
}
