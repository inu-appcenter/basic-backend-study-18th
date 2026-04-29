package class1;

public class ClassStsrt5 {
    public static void main(String[] args) {
        Student student1 = new Student(); //객체 또는 인스턴스라고 한다.
        student1.name = "학생"; //student1객체의 name멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생";
        student2.age = 15;
        student2.grade = 90;

        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        for(int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        for(Student s : students) { //향상된 for문
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        } //iter기억 많이 쓴다.

    }
}
