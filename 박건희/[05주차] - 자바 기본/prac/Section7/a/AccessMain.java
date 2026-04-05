package Section7.a;

public class AccessMain {

    public static void main(String[] args) {

        AccessData data = new AccessData();

        // 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 -> 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        /*private 호출 불가
        data.privateField = 3;
        data.privateMethod();
        */

        data.innerAccess();

    }

}
