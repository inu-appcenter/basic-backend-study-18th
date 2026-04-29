package scanner.ex;

import java.util.Scanner;

//7강
public class HelloJava7_ex4 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        while (true){
            System.out.print("이름을 입력하세요");
            String name = scanner.nextLine();

            if (name.equals("종료")){
                break;
            }

            System.out.print("나이를 입력하세요");
            int age = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력 후 age는 숫자만 가져가지 /n은 가져가지 않음->다음 입력이 문자열이면 /n을 인식해 name에 넣는 것이므로, 이 코드 안쓰면 name에 ""가 들어가버림

            System.out.println(name + age);

        }
    }
}
