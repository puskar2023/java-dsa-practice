public class Basic_ll {
    public static Node reverse(Node head){
        if(head.next == null){
            return head;
        }
        Node newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
    public static void display( Node head ){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void displayreverse(Node head){
        if(head == null) return;
        displayreverse(head.next);
        System.out.print(head.data + " ");
        return;
    }

    public static int size(Node head){
        int c = 0;
        while(head != null){
            c++;
            head = head.next;
        }
        return c;
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
        Node head = reverse(a);
        display(head);
//        displayreverse(a);
//        System.out.println();
//        System.out.println(size(a));
    }
}
