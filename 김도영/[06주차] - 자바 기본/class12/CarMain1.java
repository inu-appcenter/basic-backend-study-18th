package class12;

public class CarMain1 {
    public static void main(String[] args) {
        Driver1 driver1 = new Driver1();

        // k3
        K3Car k3Car = new K3Car();
        driver1.setCar(k3Car);
        driver1.drive();

        // 차량 변경
        ModelK3Car modelK3Car = new ModelK3Car();
        driver1.setCar((modelK3Car));
        driver1.drive();
    }
}
