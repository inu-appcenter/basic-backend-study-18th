package casting;

//6강_4
public class HelloJava6_4 {
    public static void main(String[] args){
        //다른 타입에 값을 대입하면 어떻게 될까?
        //작은 범위에서 큰 범위로는 타입이 달라도 값을 넣을 수 있다.
        // ex) int->long->double / 그러나 double->int는 큰->작은 이기 때문에 자동으로 형변환 안됌
        int a = 10;
        long b;
        double c;
        b=a; //int -> long
        System.out.println("b = " + b);

        c=a; //int -> double
        System.out.println("c = " + c);

        c=20; //long -> double
        System.out.println("c = " + c);
        // 대입하는 형(타입)을 맞추어야 하기 때문에 형을 바꾼다.
    }
}
