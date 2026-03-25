package cond;

//4강_3
public class HelloJava4_3 {
    public static void main(String[] args){
    // 조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우-> else if 문 사용X, 여러 if문을  분리해서 사용
    int price = 10000;
    int age = 10;

    if (price >= 10000){
        price-=1000;
    }
    if (age <= 10) { //else if를 사용하면 1000원 할인을 놓침
        price -= 1000;
    }
        System.out.println(price);
    }
}
