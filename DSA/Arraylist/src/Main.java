import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(6);
//        System.out.println(i);
        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        for(int i = 0; i < l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}