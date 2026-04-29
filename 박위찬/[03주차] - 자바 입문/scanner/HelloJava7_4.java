package scanner;

import java.util.Objects;
import java.util.Scanner;

//7강_4
public class HelloJava7_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("문자열 입력");
            String str= scanner.nextLine();
            if (str.equals("exit")){
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println(str);
            }
        }
    }
}
