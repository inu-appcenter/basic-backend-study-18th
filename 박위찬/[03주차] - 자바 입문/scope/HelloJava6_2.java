package scope;

//6강_2
public class HelloJava6_2 {
    public static void main(String[] args){
        int m =10; //m 생존 시작
        for (int i =0; i<2; i++){
            System.out.println("i = " + i);
            System.out.println(m);
        }// i 생존 종료
        //System.out.println("i = " + i); 실행 안됌
        System.out.println(m);
    }
}
