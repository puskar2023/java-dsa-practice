import java.util.Scanner;

public class SortZerosAndOnes {
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortZerosAndOnes(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(i < count){
                arr[i] = 0;
            }
            else{
                arr[i] = 1;
            }
        }
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
        sortZerosAndOnes(arr);
        display(arr);
    }
}
