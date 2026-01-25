import java.util.Scanner;

public class PresentQuery {
    static int[] frequencyArray(int[] arr){
        int[] freq = new int[100005];
        for(int i = 0; i < arr.length; i++){
            freq[arr[i]]++;

        }
        return freq;
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
        int[] freq = frequencyArray(arr);
        System.out.println("Enter number of querys");
        int q = sc.nextInt();
        while(q > 0){
            System.out.println("Enter the value which you want to search");
            int s = sc.nextInt();
            if(freq[s] > 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            q--;
        }

    }}
