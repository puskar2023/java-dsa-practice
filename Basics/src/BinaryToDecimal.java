import java.util.Scanner;
import java.util.*;
public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 0;
        int i = 0;
        while(n>0){
            d +=  (n%10)*(Math.pow(2, i));
            i++;
            n /= 10;
        }
        System.out.println(d);
    }
}
