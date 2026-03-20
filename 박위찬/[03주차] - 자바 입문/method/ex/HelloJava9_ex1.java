package method.ex;

//9강
public class HelloJava9_ex1 {
    public static void main(String[] args){
        System.out.println("평균 1 : "+avr(1, 2, 3));
        System.out.println("평균 2 : "+avr(15, 25, 35));

    }
    public static double avr(int a, int b, int c){
        int sum = a+b+c;
        return sum/3;
    }
}
