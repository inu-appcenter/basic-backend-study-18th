package scanner;

import java.util.Scanner;

//7강_1
public class HelloJava7_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine();  //입력을 String으로 가져온다.
        System.out.println("입력한 문자열 : "+ str);

        System.out.print("정수를 입력하세요");
        int value = scanner.nextInt(); //입력을 int로 가져온다
        System.out.println("입력한 정수 : " + value);

        System.out.print("정수를 입력하세요");
        double db = scanner.nextDouble(); //입력을 double로 가져온다
        System.out.println("입력한 실수 : " + db);

    }
}
