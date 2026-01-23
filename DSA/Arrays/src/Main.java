import java.util.Scanner;
import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Array{
    void multiarray(){
        int[][] arr = {{1,3,2}, {3,6,5}, {9,3,7}, {4,3,6}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    void array(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter no. of element");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int item: arr){
            System.out.print(item+ " ");
        }
    }

    void calcMax(){
        int arr[] = {6, 4, 2, 7, 1, 3};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    void findElement(){
        int[] arr = {1, 2, 3, 4, 9, 5};
        int x = 9;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                ans = i;
                break;
            }
        }
        System.out.println("Found " + x + " at index " + ans);
    }

    void clone_arr(int[] arr){
//        int[] arr_2 = arr.clone();
//        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        int[] arr_2 = Arrays.copyOfRange(arr, 0, arr.length);

        System.out.println("Original array");
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();
       arr_2[0] = 0;
      arr_2[1] = 0;

        System.out.println("Original array after change");
        for(int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("New array after change");
        for(int i: arr_2){
            System.out.print(i + " ");
        }
    }

    int countOccurrence(int[] arr, int x){
        int c = 0;
        for(int i = 0; i < arr.length; i++){
            if(x == arr[i]) c++;
        }
        return c;
    }
    int lastOccurrence(int[] arr, int x) {

        int lo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) lo = i;
        }
        return lo;
    }
    boolean isSorted(int[] arr){
        boolean val = true;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i-1]){
                continue;
            }else{
                val = false;
                break;
            }
        }
        return val;
    }
    int[] smallestAndLargest(int[] arr){
        int[] arr_2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr_2);
        int sm = arr_2[0];
        int lr = arr_2[arr_2.length-1];
        int[] res = {sm, lr};
        return res;
    }

}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 6, 7, 2, 3};

        Array obj = new Array();
        int[] res = obj.smallestAndLargest(arr);
        for(int i: res){
            System.out.print(i + " ");
        }
//        System.out.println(obj.isSorted(arr));
//        System.out.println(obj.lastOccurrence(arr, 6));
//        System.out.println(obj.countOccurrence(arr, 6));
//        obj.clone_arr(arr);
//        obj.array();
//        obj.multiarray();
//        obj.calcMax();
//        obj.findElement();
    }
}