package casting;

//6강_7
public class HelloJava6_7 {
    public static void main(String[] args){
        // !!서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
        int div1 =3/2; // int = int / int
        System.out.println("div1 = " + div1);
        // 1
        double div2 =3/2; // double = int / int
        System.out.println("div2 = " + div2);
        // 1.0
        double div3 =3.0/2; // double = double / int(->double 자동 형변환)
        System.out.println("div3 = " + div3);
        // 1.5
        double div4 =(double)3/2; //double = double / int(->double 자동 형변환)
        System.out.println("div4 = " + div4);
        // 1.5
    }
}
