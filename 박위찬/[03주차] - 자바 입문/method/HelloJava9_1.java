package method;

//9강-1
public class HelloJava9_1 {
    public static void main(String[] args){
        //계산1
        int a=1;
        int b=2;
        int sum1 = a+b;
        System.out.println("sum1 = " + sum1);
        
        //계산2
        int x = 10;
        int y = 20;
        int sum2 = x+y;
        System.out.println("sum2 = " + sum2);

        //같은 코드를 여러번 반복해서 작성해야 할 때 함수를 사용한다.
        // ex) 평균 함수 avg(a, b) = (a + b) / 2
        //자바에서는 함수를 메서드(Method)라 한다.

        //위 코드를 개선해보기

        int sum3 = add(15, 20); //add 함수에 15, 20 넣고 함수 실행(메서드 호출) ->return값이 sum3에 저장
        System.out.println(sum3);

        int sum4 = add(5, 10);
        System.out.println(sum4);


    }
    //add라는 이름의 메서드 생성
    public static int add(int a, int b) {
        System.out.println(a+"+"+b+"연산 수행");
        int sum = a+b;
        return sum; //sum을 함수의 결과로 반환함

        //메서드를 호출할 때는 메서드에 넘기는 값과 매개변수의 타입이 맞아야 한다.
        //넘기는 값과 매개변수의 순서와 갯수도 맞아야 한다.
    }
}
