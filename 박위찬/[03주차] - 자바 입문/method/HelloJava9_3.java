package method;

//9강-3
public class HelloJava9_3 {
    public static void main(String[] args){

    boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i){
        if (i%2 == 1){
            return true;
        } else{ //else 쓰지 않으면 if가 만족하지 않을 때 반환 못하므로 컴파일 오류 발생
            return false;
        }
    }
}
