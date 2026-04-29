package ref;

public class Method2 {
    static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        printstudent(student1);
        printstudent(student2);
    }

    static void printstudent(Student studentnum){
        System.out.println("이름:" + studentnum.name + " 나이:" + studentnum.age + " 성적:" + studentnum.grade);
    }
    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade=grade;
        return student;
    }
}
