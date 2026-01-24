import java.util.Scanner;

public class FindUnique {
    static int findUnique(int[] arr){
        int[] arr_2 = arr.clone();
        int ans = -1;
        for(int i = 0; i < arr_2.length; i++){
            for(int j = i+1; j < arr_2.length; j++){
                if(arr_2[i] == arr_2[j]){
                    arr_2[i] = -1;
                    arr_2[j] = -1;
                }
            }
        }
        for(int i = 0; i < arr_2.length; i++){
            if(arr_2[i] > 0){
                ans = arr_2[i];
            }
        }
        return ans;
    }

    static int findSecondMax(int[] array){
        int[] arr = array.clone();
        int ans = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        ans = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }


        return ans;
    }

    static int firstRepeatingElement(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Unique element: " + findUnique(arr));
//        System.out.println("Second largest element is: " + findSecondMax(arr));
        System.out.println("First repeating element is:" + firstRepeatingElement(arr));

    }
}
