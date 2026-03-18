package method;

//9강-2
public class HelloJava9_2 {
    public static void main(String[] args){
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();

    }
    public static void printHeader() {
        System.out.println("프로그램 시작");
        return; //void의 경우 생략 가능

        //매개변수가 없는 경우 : 선언 할때 void 사용, 호출할 때 인수 비우고 호출
        //반환타입이 없는 경우 : 선언 할때 void 사용, 호출하고 반환을 받지 않는다.
    }

    public static void printFooter(){
        System.out.println("프로그램 종료");
    }
}
