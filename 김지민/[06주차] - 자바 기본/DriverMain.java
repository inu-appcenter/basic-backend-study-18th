interface Car {
    void startEngine();
    void offEngine();
    void pressAccelerator();
}
class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("K3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("K3Car.offEngine");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }
}
class Model3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("Model3Car.startEngine");
    }
    @Override
    public void offEngine() {
        System.out.println("Model3Car.offEngine");
    }
    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car.pressAccelerator");
    }
}
class Driver {
    private Car car;
    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }
    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();
    }
}