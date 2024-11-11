import java.util.Scanner;
public class isogram {
    public static void isoGram(String s)
    {
        int n = s.length();
        int []arr = new int[26];
        for(int i=0;i<n;i++)
        {
            int a = s.charAt(i);
            a = a-97;
            arr[a]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>1)
            {
                int c = i+97;
                char b = (char)c;
                System.out.println("The given string is Isogram : ");
                System.out.println("The repeated character is : "+b);
                break;
            }
            else
            {
                System.out.println("Not a isogram : ");
                break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check : ");
        String s = sc.nextLine();
        isoGram(s);
    }
}
