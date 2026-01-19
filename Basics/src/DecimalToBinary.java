import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int i = 0;
        while(n>0){
            ans += (int) ((n%2) * (Math.pow(10,i)));
            i++;
            n /= 2;
        }
        System.out.println(ans);
    }
}
