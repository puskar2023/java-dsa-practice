import java.util.Scanner;

public class PrefixSum {
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void sumValues(int[] arr, int r, int l){
        int sum = 0;
        for(int i = r; i <= l; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static boolean isSubarrayAvailable(int[] arr){
        int n = arr.length;
        boolean check = false;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        int prefixsum = 0;
        for(int i = 0; i < n-1; i++){
            prefixsum += arr[i];
            if(prefixsum == sum-prefixsum){
                check = true;
                break;
            }
        }
        return check;
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
//        int[] ans = prefixSum(arr);
//        display(ans);

//        System.out.println("Enter number of querys");
//        int q = sc.nextInt();
//        while(q > 0){
//            System.out.println("Enter the range: ");
//            int r = sc.nextInt();
//            int l = sc.nextInt();
//            sumValues(arr, r, l);
//            System.out.println();
//            q--;
//        }
        System.out.println(isSubarrayAvailable(arr));
    }
}
