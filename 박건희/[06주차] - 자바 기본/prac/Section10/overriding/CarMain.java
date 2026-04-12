package Section10.overriding;

import Section10.ext3.HydrogenCar;

public class CarMain {

    static void main() {

        ElectricCar electricCar = new ElectricCar();
        electricCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}
