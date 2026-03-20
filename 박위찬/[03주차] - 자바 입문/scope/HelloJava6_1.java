package scope;

//6강_1
public class HelloJava6_1 {
    public static void main(String[] args){
        int m =10; //m 생존 시작
        if (true) {
            int x =20; //x 생존 시작
            System.out.println("m = " + m);
            System.out.println("x = " + x); //{} 안에서 만들어진 x는 그 밖에서는 사용될 수 없다.
        } // x 생존 끝
        // System.out.println("x = " + x); 이 코드는 실행시 에러가 남(x가 죽었으므로 없음)
    } // m 생존 끝
}
