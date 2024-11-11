public class LL {
    public static class Node{
        int data ; 
        Node next;
        Node (int data){
            this.data = data;
        }
    }
    public static class SinglyLL{
        Node head = null;
        Node tail = null;
        //INSERTING AT END
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp ;
        }
        //PRINTING LIST
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        //SIZE OF LIST
        int size (){
            Node temp = head ;
            int count = 0;
            while(temp!= null){
                count ++;
                temp = temp.next;
            }
            return count;
        }
        //INSERTING AT HEAD
        void insertAtHead(int val){
            Node temp = new Node(val);
            if (head==null){
                head = tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        //INSERT AT A GIVEN INDEX
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            for(int i=1;i<=idx;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        //GET ELEMENT METHOD
        int getAt(int idx){
            if(idx<0||idx>size()){
                System.out.println("WRONG INDEX");
                return -1;
            }
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        //DELETE AT INDEX METHOD
        void deleteAT(int idx){
            Node temp = head;
            for(int i=1;i<idx;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public static void main(String[] args) {
        SinglyLL l1 = new SinglyLL();
        l1.insertAtHead(12);
        l1.insertAtHead(13);
        l1.insertAtHead(16);
        l1.insertAtHead(18);
        l1.insertAtHead(11);
        l1.insertAtHead(10);
        l1.display();
        int x = l1.getAt(2);
        System.out.println(x);
        l1.insertAt(2, 98);
        int y = l1.size();
        System.out.println(y);
    }
    
}
