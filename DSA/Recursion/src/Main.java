import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    static void printDecreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }

    static int factorial(int n){
        if(n == 1){
            return n;
        }
        return factorial(n-1)*n;
    }

    static int fibonacci(int n){
        if(n == 0 ||n == 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int sumoddigits(int n){
        if(n >= 0 && n <= 9){
            return n;
        }
        return (n % 10) + sumoddigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        printIncreasing(n);

//        printDecreasing(n);

//        System.out.println(factorial(n));

//        for(int i = 1; i <= n; i++){
//            System.out.print(fibonacci(i) + " ");
//        }
        System.out.println(sumoddigits(n));
    }
}