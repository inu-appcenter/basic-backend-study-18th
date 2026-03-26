package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하시오: ");
        int num = scanner.nextInt();
        System.out.print("입력한 숫자 "+ num);
        if (num%2 == 0){
            System.out.println("은 짝수입니다.");
        }else {
            System.out.println("은 홀수입니다.");
        }
    }
}
