package ref;

public class Method1 {
    static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        initStudent(student1, "학생1", 15, 90);
        initStudent(student2, "학생2", 16, 80);


        printstudent(student1);
        printstudent(student2);
    }

    static void printstudent(Student studentnum){
        System.out.println("이름:" + studentnum.name + " 나이:" + studentnum.age + " 성적:" + studentnum.grade);
    }
    static  void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade=grade;
    }
}
