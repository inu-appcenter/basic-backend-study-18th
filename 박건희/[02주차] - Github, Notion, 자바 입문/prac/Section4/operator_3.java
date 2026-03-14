package Section4;
// 연산자 우선순위
public class operator_3 {
    public static void main(String[] args) {

        int sum1 = 1 + 2 * 3; //1 + (2 * 3)과 같다.
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3); // sum3과 동일한 값을 가짐
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 연산자의 우선순위는 상식선의 연산을 생각하거나 헷갈린다면 괄호 활용하기
    }
}
