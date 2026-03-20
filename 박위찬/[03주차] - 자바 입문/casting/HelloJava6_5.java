package casting;

//6강_5
public class HelloJava6_5 {
    public static void main(String[] args){
        //double 은 실수를 표현할 수 있다. 따라서  1.5 가 가능하다.
        //그런데 int는  실수를 표현할 수 없다. 그래도 넣고싶다면?
        double doubleValue = 1.5;
        int intValue = 0;

        //intValue = doubleValue; //컴파일 오류 발생
        intValue = (int) doubleValue; //형변환
        System.out.println(intValue); //출력:1(소숫점 버림)

        System.out.println((int) 10.5);
    }
}
