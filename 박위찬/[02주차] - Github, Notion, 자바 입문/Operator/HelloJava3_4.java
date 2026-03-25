package Operator;

//3강_4
public class HelloJava3_4 {
    public static void main(String[] args){
        int a=0;
        a=a+1;
        System.out.println("a = " + a);
        
        a=a+1;
        System.out.println("a = " + a);

        //증감 연산자(자주 사용)
        ++a;// a=a+1
        System.out.println("a = " + a); //3
        ++a; //a=a+1
        System.out.println("a = " + a); //4
        --a;
        System.out.println("a = " + a); //3

        //a++, ++a 차이점 이해하기
        int b=1;
        int c=0;
        c=++b; //(전위 증감 연산자)->b의 값을 먼저 증가시키고, 그 결과를 c에 대입
        System.out.println("b=" + b+", c=" + c);

         b =1;
         c =0;
         c=b++; //(후위 증감 연산자)->b의 값을 c에 먼저 대입하고, 그 후 b의 값을 증가
         System.out.println("b=" + b+", c=" + c);
    }
}
