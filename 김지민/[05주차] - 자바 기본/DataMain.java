import packageA.Data;

import static packageA.Data.*;

public class DataMain {
    public static void main(String[] args) {
        System.out.println(getCount());
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        System.out.println(data1.id +  " " + data2.id +  " " + data3.id);

        data1.changeID(data1, 3);
    }
}