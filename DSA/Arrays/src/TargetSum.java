import java.util.Scanner;

public class TargetSum {
    static int numOfTargetSum(int[] arr, int x){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]+arr[j] == x) c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value");
        int t = sc.nextInt();
        System.out.println(numOfTargetSum(arr, t));
    }
}
