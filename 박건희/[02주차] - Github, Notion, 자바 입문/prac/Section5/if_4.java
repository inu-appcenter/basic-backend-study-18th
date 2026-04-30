package Section5;
// switch
public class if_4 {
    static void main() {

        // if문으로 표현
        int grade = 2;
        int coupon;

        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }

        System.out.println("발급받은 쿠폰 " + coupon);

        // switch문으로의 표현
        switch (grade) {
            case 1:
                coupon = 1000;
                break; // break가 없으면 다음 case의 코드를 실행
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);

        // 자바에서 기존의 switch문의 장점을 살리기 위해서 더욱 깔끔한 형태로 사용가능하게 함.
        int coupon_1 = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon_1);

    }
}
