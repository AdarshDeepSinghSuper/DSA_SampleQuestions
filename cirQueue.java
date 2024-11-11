import java.util.Scanner;
public class cirQueue {
    class Node
    {
        int data;
        Node next;
        public  Node(int data)
        {
            this.data = data;
        }

    }
    public void add(int data)
    {
        Node newNode  = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
            return;
        } 
        head.next = newNode;
        tail=newNode;
        size++;

    }
    public int pop()
    {
        int pop = 0;
        pop = head.data;
        head = head.next;
        size--;
        return pop;

    }

    public static int size = 0;
    public static Node head;
    public static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            // System.out.println("Enter the elements and type 'Done' if complete entring elements : " );
            System.out.println("enter no of elements : ");
            int n = sc.nextInt();
            cirQueue Q1 = new cirQueue();
            while(n>0)
            {
                int count = 1;
                System.out.println("Enter element "+count);
                int a = sc.nextInt();
                Q1.add(a);
                count ++;
                n--;
            }
            System.out.println(Q1.pop());
        }
    }
}
