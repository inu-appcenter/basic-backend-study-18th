package Session8;

import java.util.Scanner;

public class Age {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 :");
        String name = scanner.nextLine(); // 이름 입력

        System.out.print("당신의 나이를 입력하세요 :");
        int age = scanner.nextInt(); // 나이 입력

        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살입니다.");
    }
}
