package array.ex;

import java.util.Locale;
import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {

        int[] numbers= new int[5];
        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            numbers[i] = scanner.nextInt();
        }
        System.out.println("출력");
        for (int number : numbers) {
            System.out.print(number);
            if(number != numbers[numbers.length - 1]){
                System.out.print(", ");
            }
        }

    }
}
