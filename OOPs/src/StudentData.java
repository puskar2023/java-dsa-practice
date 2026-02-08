public class StudentData {
    public static class Student{
        String name;
        int age;
        int roll_no;
    }
    static void change(Student s){
        s.age = 22;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Puskar";
        s1.age = 21;
        s1.roll_no = 75;
        System.out.println(s1.age);
        change(s1);
        System.out.println(s1.age);
        System.out.println(s1.name);
    }
}
