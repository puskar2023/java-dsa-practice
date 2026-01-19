class Student {
    int rollNo;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Puskar";
        System.out.println(s1.rollNo);
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Apurba";
        System.out.println(s2.rollNo);
        System.out.println(s2.name);
    }
}