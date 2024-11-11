public class LinkedList {
    public static class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data)
    {
        //create new Node
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //new node next = head
        newNode.next=head;
        //head = new Node
        head = newNode;
    }
    public void addLast(int data)
    {
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        //tail.next=newNode
        tail.next = newNode;
        //tail = newNode
        tail = newNode;
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data)
        {
            if(idx==0)
            {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i=0 ;
            while(i < idx-1)
            {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        ll.add(4, 5);
        ll.print();
        System.out.println(ll.size);
    } 
}
