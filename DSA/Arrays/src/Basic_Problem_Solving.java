import java.util.Scanner;

public class Basic_Problem_Solving {
    static void swap(int a, int b){
        System.out.println("Before swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);

    }
}
