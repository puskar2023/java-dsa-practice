import java.util.Scanner;
import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static int[] remove(int[] arr){
        int[] ans = new int[10];
        Stack<Integer> st = new Stack<>();
        int n = 1;
        int j = 0;
        st.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(st.peek() == arr[i]){
                n++;
                continue;
            }else{
                if(n>1){
                    st.pop();
                    n=1;
                    st.push(arr[i]);
                }else{
                    ans[j] = st.pop();
                    j++;
                    st.push(arr[i]);
                }

            }
        }
        if(st.size()>0){
            ans[j] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = remove(arr);
        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}
