import java.util.Scanner;

public class PrefixSum {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        return arr;
    }

    static void display(int[] arr){
        for(int i: arr){
            System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = prefixSum(arr);
        display(ans);
    }
}
