package loop;

//5강_3
public class HelloJava5_3 {
    public static void main(String[] args){
        //do-while문 구조 -> 조건에 만족하지 않아도 1번은 실행

        int i=10;

        do {
            System.out.println(i);
            i++;
        } while (i<3);
    }
}
