package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        data.value = 10;
        System.out.println("2. data = " + data + " 가격 = " + data.value);
        data = null; //참조가 끊긴다.-> GC가 처리한다.
        System.out.println("3. data = " + data);
        data = new Data();
        System.out.println(data.value);
    }
}
