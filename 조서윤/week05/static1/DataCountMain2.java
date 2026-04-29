package week05.static1;

public class DataCountMain2 {

    static void main() {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count=" + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("A count=" + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("A count=" + counter.count);
    }
}
