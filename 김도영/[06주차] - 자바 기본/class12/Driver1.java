package class12;

public class Driver1 {
    private Car car;
    public void setCar(Car car){
        System.out.println("자동차 설정"+car);
        this.car = car;
    }
    public void drive(){
        System.out.println("drive");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
