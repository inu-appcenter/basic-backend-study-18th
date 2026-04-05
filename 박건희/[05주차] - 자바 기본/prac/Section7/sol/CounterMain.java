package Section7.sol;

public class CounterMain {

    static void main() {

        MaxCounter counter = new MaxCounter(3);

        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        int count = counter.getCount();

        System.out.println(count);

    }

}
