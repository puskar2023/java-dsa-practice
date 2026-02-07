package strings;

import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder("");
        StringBuilder ans = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.reverse();
                ans.append(sb);
                ans.append(" ");
                sb.delete(0, sb.length());
            }else if(i == str.length()-1){
                sb.append(str.charAt(i));
                sb.reverse();
                ans.append(sb);
                ans.append(" ");
                sb.delete(0, sb.length());
            }else{
                sb.append(str.charAt(i));
            }

        }
        System.out.println(ans);
    }
}
