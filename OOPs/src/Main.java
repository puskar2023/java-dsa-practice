import java.util.Scanner;

class Algebra {
    int a;
    int b;

    Algebra(int x, int y){
        a = x;
        b = y;
    }

    int sum(){
        return a + b;
    }
    int sub(){
        return a - b;
    }
    int mul(){
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Algebra obj = new Algebra(a, b);
        System.out.println(obj.sum());
        System.out.println(obj.sub());
        System.out.println(obj.mul());


    }
}









//class Student {
//    int rollNo;
//    String name;
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.rollNo = 1;
//        s1.name = "Puskar";
//        System.out.println(s1.rollNo);
//        System.out.println(s1.name);
//
//        Student s2 = new Student();
//        s2.rollNo = 2;
//        s2.name = "Apurba";
//        System.out.println(s2.rollNo);
//        System.out.println(s2.name);
//    }
//}