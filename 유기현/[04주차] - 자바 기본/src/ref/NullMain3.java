package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData(); //x001
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData,data = " + bigData.data);

        //NullPointerExxeption
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
