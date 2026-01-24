import java.util.Scanner;

public class Basic_Problem_Solving {
    static void swap(int a, int b){
        System.out.println("Before swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
//        int temp = a;
//        a = b;
//        b = temp;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap");
        System.out.println("a" + a);
        System.out.println("b" + b);
    }
    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        swap(a, b);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans = reverseArray(arr);
        for(int item: ans){
            System.out.print(item + " ");
        }

    }
}
