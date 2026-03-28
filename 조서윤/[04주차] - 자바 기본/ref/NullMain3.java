package ref;

public class NullMain3 {

    static void main() {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value); //null.value
    }
}
