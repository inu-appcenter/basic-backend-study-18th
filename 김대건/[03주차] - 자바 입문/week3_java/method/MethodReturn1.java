package method;

import java.security.spec.RSAOtherPrimeInfo;

public class MethodReturn1 {

    public static void main(String[] args) {

        int a = 6;

        if(odd(a)){
            System.out.println("홀수 입니다.");
        }else {
            System.out.println("짝수 입니다.");
        }
    }

    public  static  boolean odd(int i){
        if((i % 2) == 1){
            return true;
        } else {
            return false;
        }

    }
}
