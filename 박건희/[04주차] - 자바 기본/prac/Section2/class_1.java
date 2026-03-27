package Section2;

public class class_1 {

    public static void main(String[] args) {
        // 배열로 표기
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름:" + studentNames[i] + " 나이:" + studentAges[i] + " 성적:" + studentGrades[i]);
        }

        Student student1;
        student1 = new Student();
        // 객체 값 대입
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();

        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

        // 클래스 배열을 이용
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
        }
    }
}
// 다음과 같이 선언 할 수도 있음.
// Student[] students = new Student[]{student1, student2};
// Student[] students = {student1, student2};