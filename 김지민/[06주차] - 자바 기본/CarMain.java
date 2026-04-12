class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }
    public void openDoor() {
        System.out.println("문을 엽니다.");
    }
}
class ElectricCar extends Car {
    public void charge() {
        System.out.println("충전합니다.");
    }
}
class GasCar extends Car {
    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
        gasCar.openDoor();
    }
}