package strings;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int asci = (int)ch;
            char nch;
            if(asci < 97){
                nch = (char)(asci+32);
            }else{
                nch = (char)(asci-32);
            }
            str.setCharAt(i, nch);
        }
        System.out.println(str);
    }
}
