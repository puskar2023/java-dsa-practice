import java.util.Scanner;
import java.util.Stack;

public class moveStackInSameOrder {

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
    }
}
