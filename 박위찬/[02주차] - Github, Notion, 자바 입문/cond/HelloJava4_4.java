package cond;

//4강_4
public class HelloJava4_4 {
    public static void main(String[] args){
        /*int grade =2;

        int coupon;
        if (grade==1) {
            coupon=1000;
        } else if (grade==2) {
            coupon=2000;
        } else if (grade==3) {
            coupon=3000;
        } else {
            coupon=500;
        }
        System.out.println("발급받은 쿠폰 :"+coupon);*/

        //switch문(변수의 값이 조건과 '같은가'?만 확인 가능함.)
        int grade=2;

        int coupon;
        switch (grade){
            case 1:
                coupon=1000;
                break; //break는 현재 switch문을 벗어나게 해줌.
            case 2:
                coupon=2000;
                break;  //여기서 break가 없었다면 case3으로 넘어가 coupon 값이 3000이 됨
            case 3:
                coupon=3000;
                break;
            default:
                coupon=500;
        }
        System.out.println(coupon);
        //새로운 switch문
        int coupon2 = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println(coupon2);
    }
}
