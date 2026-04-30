package Section9;

import java.util.Scanner;

public class array_10 {
    public static void main(String[] args) {

        // Q1.
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);

        // Q2.
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        // Q3.
        int[] numbers_1 = new int[5];
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers_1[i] = scanner.nextInt();
        }
        System.out.println("입력한 정수를 역순으로 출력:");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers_1[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }

        // Q4.
        int[] numbers_2 = new int[5];
        int sum = 0;
        double average_1;
        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < 5; i++) {
            numbers_2[i] = scanner.nextInt();
            sum += numbers[i];
        }
        average_1 = (double) sum / 5;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average_1);
    }
}
