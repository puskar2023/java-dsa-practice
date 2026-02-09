
class Student{
    public String name;
    public int age;
    private int roll_no;

    public int getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(int rno){
        roll_no = rno;
    }
}

public class StudentData {

    static void change(Student s){
        s.age = 22;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Puskar";
        s1.age = 21;
        s1.setRoll_no(75);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.getRoll_no());
    }
}
