package Section10;

public class method_4 {

    public static void main(String[] args) {

        checkAge(10);
        checkAge(20);

        int num1 = 5;
        int num2 = num1; // JAVA는 값을 복사하여 대입합.
        num2 = 10;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);

    }

    public static void checkAge(int age) {
        if (age < 18) {

            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요.");
    }

}
