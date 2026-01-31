import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    static void reverse(ArrayList<Integer> l){
        int i = 0;
        int j = l.size()-1;
        while(i < j){
            Integer temp = Integer.valueOf(l.get(i));
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
        System.out.println(l);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(6);
        l.add(9);
        l.add(3);
        l.add(7);
        l.add(1);
//        reverse(l);

//        Collections.reverse(l);
//        System.out.println("Reverse List: " + l);

        Collections.sort(l, Collections.reverseOrder()); //decreasing order
        System.out.println("Decreasing order: " + l);
    }
}
