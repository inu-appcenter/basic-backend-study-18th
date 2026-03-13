package Operator;

//3강_6
public class HelloJava3_6 {
    public static void main(String[] args){
        //논리연산자(true, false 비교하는데 사용 &&,||, !)
        System.out.println("&&:AND연산");
        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("||:OR연산");
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a=true;
        boolean b=false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);
        System.out.println(!b);

        //논리 연산자 활용(t는 10보다 크고 20보다 작다)
        int t=15;
        boolean result= 10<t && t<20;
        System.out.println(result);
    }
}
