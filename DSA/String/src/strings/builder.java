package strings;
import java.util.*;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
//        str.append("world");

//        str.setCharAt(0, 'm');

//        str.insert(0, "hi");

//        str.deleteCharAt(0);

//        str.reverse();

        str.delete(2,4);
        System.out.println(str);
    }
}
