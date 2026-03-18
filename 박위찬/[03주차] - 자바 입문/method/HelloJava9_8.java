package method;

//9강-8
public class HelloJava9_8 {
    public static void main(String[] args){
        //자바는 메서드의 이름 뿐만 아니라 매개변수 정보를 함께 사용해서 메서드를 구분한다.
        //따라서 다음과 같이 이름이 같고, 매개변수가 다른 메서드를 정의할 수 있다.
        //add(int a, int b)
        //add(int a, int b, int c)
        //add(double a, double b)

        //매개변수의 갯수가 다른 오버로딩 예제

        System.out.println("1 : "+add(1,2));
        System.out.println("2 : "+add(1,2,3));


    }
    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a+b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}
