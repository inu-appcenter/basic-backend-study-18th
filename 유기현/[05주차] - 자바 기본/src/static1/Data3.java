package static1;

public class Data3 {
    public String name;
    public static int count;

    public Data3(String name) {
        this.name = name;
        count++; //원래는 Data3.count해야하지만 생략가능
    }
}
