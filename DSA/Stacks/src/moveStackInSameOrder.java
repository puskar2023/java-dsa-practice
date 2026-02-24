import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {

    public static void display(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        display(st);
        System.out.println(top);
        st.push(top);
        return;
    }

    public static Stack<Integer> reverseStack(Stack<Integer> st){
        Stack<Integer> revst = new Stack<>();
        while(st.size() > 0){
            revst.push(st.pop());
        }
        return revst;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of element you want to insert: ");
        n = sc.nextInt();
        System.out.println("Enter all elements: ");
        for(int i = 1; i <= n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Original stack: " + st);
        Stack<Integer> revst = reverseStack(st);
        System.out.println("Reverse stack: " + revst);
        Stack<Integer> ogst = reverseStack(revst);
        System.out.println("New stack same order: " + ogst);
        display(ogst);
        System.out.println("New stack same order: " + ogst);
    }
}
