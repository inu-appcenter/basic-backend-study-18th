package cond.ex;

//4강
public class HelloJava4_ex4 {
    public static void main(String[] args){
        double rating = 7.1;

        if (rating<=9){
            System.out.println("어바웃 타임을 추천");
        }
        if (rating<=8){
            System.out.println("고질라를 추천");
        }
        if (rating<=7){
            System.out.println("토이스토리를 추천");
        }
    }
}
