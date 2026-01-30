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

    static void multiplication(int[][] arr1, int[][] arr2, int r1, int r2, int c1, int c2){
        int[][] ans = new int[r1][c2];
        if(c1 != r2){
            System.out.println("multiplication is not possible");
            return;
        }

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < r2; k++){
                  ans[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        display(ans, r1, c2);
        return;
    }

    static void reverse(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    static void rotate2DArray(int[][] arr, int r, int c){
        int[][] trans = new int[c][r];
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                trans[i][j] = arr[j][i];
            }
        }
        for(int i = 0; i < trans.length; i++){
            reverse(trans[i]);
        }
        display(trans, c, r);
    }

    static void transpose(int[][] arr){
        int[][] ans = new int[arr[0].length][arr.length];
        if(arr[0].length != arr.length){
            for(int i = 0; i < arr[0].length; i++){
                for(int j = 0; j < arr.length; j++){

                    ans[i][j] = arr[j][i];
                }
            }
            display(ans, arr[0].length, arr.length);

        }else{
            for(int i = 0; i < arr.length; i++){
                for(int j = i; j < arr[0].length; j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
            display(arr, arr.length, arr[0].length);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows of first array: ");
//        int r1 = sc.nextInt();
//        System.out.println("Enter number of columns of first array: ");
//        int c1 = sc.nextInt();
//        int[][] array1 = new int[r1][c1];
//        System.out.println("Enter all elements of first array: ");
//        for(int i = 0; i < r1; i++){
//            for(int j = 0; j < c1; j++){
//                array1[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter number of rows of second array: ");
//        int r2 = sc.nextInt();
//        System.out.println("Enter number of columns of second array: ");
//        int c2 = sc.nextInt();
//        int[][] array2 = new int[r2][c2];
//        System.out.println("Enter all elements of second array: ");
//        for(int i = 0; i < r2; i++){
//            for(int j = 0; j < c2; j++){
//                array2[i][j] = sc.nextInt();
//            }
//        }
//        multiplication(array1, array2, r1, r2, c1, c2);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        int[][] array = new int[r][c];
        System.out.println("Enter all elements of array: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array[i][j] = sc.nextInt();
            }
        }
//        transpose(array);
        rotate2DArray(array, r, c);
    }
}
