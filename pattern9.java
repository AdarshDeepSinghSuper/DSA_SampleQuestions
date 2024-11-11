import java.util.Scanner;
public class pattern9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows : ");
        int row = sc.nextInt();
        System.out.println("Enter column : ");
        int column = sc.nextInt();
        int num = 1;
        int mid = column/2;
        int position = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(i==0 && j==mid)
                {
                    System.out.print(num);
                    num++;
                }
                else if(i==0)
                {
                    System.out.print(" ");
                }
                if(j== column-1)
                {
                    System.out.println();
                }
                if(i>0 && (j==mid-num||j==mid+num))
                {
                    System.out.print(num);
                }
                else
                {
                    System.out.print(" ");
                }

            }
            if(i>0)
            {
                num++;
            }
            if(i==3)
            {
                for(int k=0;k<column;k++)
                {
                    System.out.print(num);
                }
            }
            
        }
    }
}