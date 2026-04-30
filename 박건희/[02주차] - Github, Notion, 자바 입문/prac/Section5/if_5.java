package Section5;
// 삼항 연산자
public class if_5 {
    static void main() {


        // if else문을 활용해서 표현
        int age = 18;
        String status;

        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }

        System.out.println("age = " + age + " status = " + status);

        // 삼항 연산자를 이용하여 표현
        String status_t = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status_t);

    }
}
