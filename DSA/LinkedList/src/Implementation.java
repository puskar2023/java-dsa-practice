public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
                return;
            }
            tail.next = temp;
            tail = temp;
        }
        void insertAtBegining(int data){
            Node temp = new Node(data);
            if(head == null){
                head = tail = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }
        void insertAt(int p, int data){
            if(p == 0){
                insertAtBegining(data);
            }
            else if(p == size()) {
                insertAtEnd(data);
            }
            else{
                Node temp = head;
                Node n = new Node(data);
                for(int i = 1; i < p; i++){
                    temp = temp.next;
                }
                n.next = temp.next;
                temp.next = n;

            }
        }
        int size(){
            int s = 0;
            Node temp = head;
            while(temp != null){
                s++;
                temp = temp.next;
            }
            return s;
        }
        void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(6);
        ll.insertAtEnd(9);
        ll.insertAtEnd(5);
        ll.insertAtEnd(1);
        ll.insertAt(2,3);
        ll.insertAt(6,3);
        System.out.println(ll.size());
        ll.display();

    }
}
