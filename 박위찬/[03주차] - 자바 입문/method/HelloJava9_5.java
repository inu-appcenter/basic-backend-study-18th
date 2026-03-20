package method;

//9강-5
public class HelloJava9_5 {
    public static void main(String[] args){
        //자바는 항상 변수의 값을 복사해서 대입한다 -> num2에 num1을 대입하였다 = num1의 "값"을 num2에 "복사하였다".
        int num1 = 5;
        System.out.println("num1 = " + num1);
        changeNumber(num1);
        System.out.println("호출 후 num1 = " + num1);
    }

    public static void changeNumber(int num2){
        System.out.println("변경 전"+num2);
        num2 *=2;
        System.out.println("변경 후"+num2);

    }
}
