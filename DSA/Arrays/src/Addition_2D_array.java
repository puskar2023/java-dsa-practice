import java.sql.SQLOutput;
import java.util.Scanner;

public class Addition_2D_array {
    static void display(int[][] arr, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static int[][] add(int[][] arr1, int r, int c, int[][] arr2){
        int[][] ans = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] array1 = new int[r][c];
        System.out.println("Enter all elements of first array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        int[][] array2 = new int[r][c];
        System.out.println("Enter all elements of second array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array2[i][j] = sc.nextInt();
            }
        }
        int[][] ans = add(array1, r, c, array2);
        display(ans, r, c);

    }
}
