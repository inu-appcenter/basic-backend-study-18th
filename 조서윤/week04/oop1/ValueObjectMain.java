package week04.oop1;

public class ValueObjectMain {

    static void main() {
        ValueData valueData = new ValueData();
        valueData.add();
        valueData.add();
        valueData.add();
        System.out.println("최종 숫자 = " + valueData.value);
    }

    static void add(ValueData valueData) {
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
