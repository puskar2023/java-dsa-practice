
class Student{
    String name;
    int age;
    private int roll_no;
    static int numberOfStudents;

    public int getRoll_no(){
        return roll_no;
    }
    public void setRoll_no(int rno) {
        roll_no = rno;
    }


    public Student(String name,int age,int roll_no){
        this.name = name;
        this.age = age;
        setRoll_no(roll_no);
        numberOfStudents++;
    }
}

public class StudentData {

    static void change(Student s){
        s.age = 22;
    }
    public static void main(String[] args) {
        Student s1 = new Student("Puskar", 21, 75);
        Student s2 = new Student("Apurba", 21, 78);

        System.out.println(s1.numberOfStudents);
    }
}
