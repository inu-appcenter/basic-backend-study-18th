package class12;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3 k3 = new K3();

        driver.setk3(k3);
        driver.drive();

        // 추가
        ModelK3 modelK3 = new ModelK3();
        driver.setk3(null);
        driver.setModelK3(modelK3);
        driver.drive();
    }
}
