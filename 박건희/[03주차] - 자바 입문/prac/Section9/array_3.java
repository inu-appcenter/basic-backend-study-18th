package Section9;

public class array_3 {
    public static void main(String[] args) {

        int[] students;
        students = new int[5];

        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // int[] students = {90, 80, 70, 60, 50}; 배열 선언 가능.


        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
