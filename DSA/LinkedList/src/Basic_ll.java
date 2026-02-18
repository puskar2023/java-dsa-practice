public class Basic_ll {
    public static void display( Node head ){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.println(head.data);
        return;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(6);
        a.next = b;
        b.next = c;
//        display(a);
        displayreverse(a);
    }
}
