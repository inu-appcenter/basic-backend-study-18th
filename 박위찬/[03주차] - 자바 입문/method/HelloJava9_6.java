package method;

//9강-6
public class HelloJava9_6 {
    public static void main(String[] args){
        int number = 5;
        System.out.println("num1 = " + number);
        changeNumber(number);
        System.out.println("호출 후 num1 = " + number);
    }

    // 호출자의 변수 이름과 매개변수의 이름이 같지만 각자 다른 메서드{} 안에서 만들어진 변수이므로 서로 다르다.

    public static void changeNumber(int number){
        System.out.println("변경 전"+number);
        number *=2;
        System.out.println("변경 후"+number);

    }
}
