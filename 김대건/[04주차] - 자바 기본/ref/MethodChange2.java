package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메시지 호출 전 : " + dataA.value);
        changeReference(dataA);
        System.out.println("메시지 호출 후 : " + dataA.value);

    }

    public static void changeReference(Data data){
        data.value = 20;
    }
}
