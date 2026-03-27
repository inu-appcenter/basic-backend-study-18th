package Scetion3;

public class PvsR_1 {

    static void main() {
        int a = 10;
        int b = a;

        int sum = a + b;
        System.out.println(sum);

        Student s1 = new Student();
        s1.grade = 90;
        Student s2 = new Student();
        s2.grade = 100;

        sum = s1.grade + s2.grade;
        System.out.println(sum);

        s2 = s1;
        System.out.println(s2.grade);


    }
}
