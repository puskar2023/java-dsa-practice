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




}

public class Main {
    public static void main(String[] args) {
        Arrays obj = new Arrays();
        obj.array();
//        obj.multiarray();
//        obj.calcMax();
//        obj.findElement();
    }
}