package class1;

public class ClassStsrt4 {
    public static void main(String[] args) {
        Student student1 = new Student(); //객체 또는 인스턴스라고 한다.
        student1.name = "학생"; //student1객체의 name멤버 변수에 값 대입
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생";
        student2.age = 15;
        student2.grade = 90;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);


    }
}
