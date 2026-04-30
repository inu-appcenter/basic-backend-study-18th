package Section9;

import java.util.Scanner;

public class array_11 {
    public static void main(String[] args) {

        // Q5.
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요:");

        int count = scanner.nextInt();
        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요:");

        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

        // Q6.
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int n = scanner.nextInt();
        int[] numbers_1 = new int[n];
        int minNumber, maxNumber;
        System.out.println(n + "개의 정수를 입력하세요:");
        for (int i = 0; i < n; i++) {
            numbers_1[i] = scanner.nextInt();
        }
        minNumber = maxNumber = numbers_1[0];
        for (int i = 1; i < n; i++) {
            if (numbers_1[i] < minNumber) {
                minNumber = numbers_1[i];
            }
            if (numbers_1[i] > maxNumber) {
                maxNumber = numbers_1[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);

    }
}
