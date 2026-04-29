package cond;

//4강_5
public class HelloJava4_5 {
    public static void main(String[] args){
        //삼항 연산자 (특정 조건이 맞는지 아닌지 한번에 확인 및 대입-> (조건) ? 참_표현식 : 거짓_표현식)
        int age=18;
        String status = (age>=18) ? "성인" : "미성년자";
        System.out.println("status = " + status);
    }
}
