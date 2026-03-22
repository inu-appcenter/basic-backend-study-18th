package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers= new int[count];


        System.out.println(count+"개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            if(max < number){
                max = number;
            }else if(min > number){
                min = number;
            }
        }

        System.out.println("가장 큰 수: " + max);
        System.out.println("가장 작은 수: " + min);

    }
}
