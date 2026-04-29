package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = creatStudent("학생1", 15, 90);
        System.out.println("student1 = " + student1);
        Student student2 = creatStudent("학생2", 16, 80);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student creatStudent(String name, int age, int grade){
        Student student = new Student(); //x001
        System.out.println("student = " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; //x001
    }

    static void printStudent(Student student) {
        System.out.println("이름 " + student.name + " 나이 " + student.age
                + " 학년 " + student.grade);
    }
}
