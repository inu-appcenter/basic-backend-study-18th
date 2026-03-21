package Section5;
// else if
public class if_2 {
    static void main() {
        int age = 8;

        if (age <= 7) {
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16) {
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }
        // 모든 조건문의 조건을 확인하며 실행됨. -> 이 프로그램에서는 비효율적인 코드 진행임.
        // -> else if 문 사용.

        age = 33;

        if(age <= 7) {
            System.out.println("미취학");
        }
        else if(age <= 13) {
            System.out.println("초등학생");
        }
        else if(age <= 16) {
            System.out.println("중학생");
        }
        else if(age <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인");
        }
        //모든 조건문을 확인하지 X 한 조건문이 참이면 조건 검사가 끝남.
    }
}
