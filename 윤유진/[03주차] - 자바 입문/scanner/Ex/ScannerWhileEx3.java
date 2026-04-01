package scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            sum += num;
            cnt += 1;
        }

        System.out.println("입력된 숫자들의 총 합계: " + sum);
        System.out.println("입력된 숫자들의 평균: " + (double) sum / cnt);
    }
}
