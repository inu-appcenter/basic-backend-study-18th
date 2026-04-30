package Section5;
// if-else와 if의 활용
public class if_3 {
    static void main() {

        int price = 10000;// 아이템 가격
        int age = 10;//나이
        int discount = 0;


        //if
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        System.out.println("총 할인 금액: " + discount + "원");


        //else if
        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");


        // if문에서 중괄호를 생략한다면 들여쓰기한 다음 한줄만 조건문에 종속됨.
    }
}
