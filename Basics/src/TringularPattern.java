import java.util.Scanner;

public class TringularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int s = 1; s <= r-i; s++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
