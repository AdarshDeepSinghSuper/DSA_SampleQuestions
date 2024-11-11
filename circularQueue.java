// import java.util.Scanner;
// public static int pop(int[]arr,int popidx)
// {

// }
// public static int peek(int []arr,int idx)
// {

// }
// public static int push(int []arr,int idx)
// {

// }
// public static boolean isEmpty(int [] arr)
// {
//     if(arr.length == 0)
//     {
//         return true;
//     }
//     return false;
// }
// public class circularQueue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int [] arr = new int [10];
//         int size =0;
//         int idx =0;
//         int popidx = 0;
//         System.out.println("enter the no of elements you want to enter *(note must be <10) :  ");
//         int n = sc.nextInt();
//         if(n > 10 )
//         {
//             System.out.println("you have entred wrong value ");
//         }
//         for(int i=0;i<10;i++)
//         {
//             int count = 1;
//             System.out.println("enter element :"+ count);
//             int a = sc.nextInt();
//             arr[i] = a;
//             size++;
//             idx++;
//         }
//         int p = pop(arr, popidx);
//         System.out.println("poped element "+p);
//     }
// }
import java.util.Scanner;

public class circularQueue {

    public static int pop(int[] arr, int popidx) {
        if (isEmpty(arr)) {
            return -1;
        }
        int element = arr[popidx];
        popidx = (popidx + 1) % arr.length;
        return element;
    }

    public static int peek(int[] arr, int idx) {
        if (isEmpty(arr)) {
            return -1;
        }
        return arr[idx];
    }

    public static int push(int[] arr, int idx) {
        if (idx == arr.length) {
            return -1;
        }
        return idx;
    }

    public static boolean isEmpty(int[] arr) {
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int size = 0;
        int idx = 0;
        int popidx = 0;
        System.out.println("enter the no of elements you want to enter *(note must be <10):  ");
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("you have entered wrong value ");
        }
        for (int i = 0; i < n; i++) {
            int count = 1;
            System.out.println("enter element: " + count);
            int a = sc.nextInt();
            arr[i] = a;
            size++;
            idx++;
        }
        int p = pop(arr, popidx);
        System.out.println("popped element " + p);
    }
}

