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
//        for(int i = 0; i < l1.size(); i++){
//            System.out.println(l1.get(i));
//        }

        //add element at a particular index
        l1.add(1, 100);

        //modify element
        l1.set(1, 10);

        //remove
        l1.remove(1);

        //remove by value
        l1.remove(Integer.valueOf(7));

        //checking an element is available in the list or not
        System.out.println(l1.contains(Integer.valueOf(6)));


        System.out.println(l1);
    }
}