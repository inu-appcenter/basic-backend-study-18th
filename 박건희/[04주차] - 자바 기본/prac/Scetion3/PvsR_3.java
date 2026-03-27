package Scetion3;

public class PvsR_3 {

    static void main() {
        Student student1 = new Student();
        initStudent(student1, "학생1", 15, 90);
        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade)
    {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + "성적:" + student1.grade);
    }
}
