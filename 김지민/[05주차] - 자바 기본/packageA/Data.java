package packageA;

public class Data {
    public static int count = 0;
    public int id;
    public Data() {
        id = count;
        count++;
    }
    public void changeID(Data data, int id) {
        data.id = id;
    }
    public static int getCount() {
        return count;
    }
}
