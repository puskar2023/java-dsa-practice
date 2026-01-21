import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Arrays{
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
        int[] arr = new int[6];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int item: arr){
            System.out.println(item);
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



}

public class Main {
    public static void main(String[] args) {
        Arrays obj = new Arrays();
//        obj.array();
//        obj.multiarray();
        obj.calcMax();
    }
}