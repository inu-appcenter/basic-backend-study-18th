package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        //instanceValue++; //인스턴스 변수 접근 불가
        //instanceMethod(); //인스턴스 메서드 접근 불가
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instanceValue = "+instanceValue);
    }

    private static void staticMethod(){
        System.out.println("staticValue = "+staticValue);
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }
}
