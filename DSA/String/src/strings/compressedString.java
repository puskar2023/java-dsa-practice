package strings;

import java.util.Scanner;

public class compressedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        ans += str.charAt(0);

        int c = 1;

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i-1)){
                c++;
            }else{
                ans += c;
                ans += str.charAt(i);
                c = 1;
            }

            if(i == str.length()-1){
                ans += c;
            }

        }

        System.out.println(ans);
    }
}
