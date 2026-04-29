package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); //0
        System.out.println("bigData.date = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value); //null의 value => 오류
    }
}
