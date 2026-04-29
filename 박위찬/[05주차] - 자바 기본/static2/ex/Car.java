package static2.ex;

public class Car {
    private static int totalcar;
    private String name;

    public Car(String name){
        this.name = name;
        System.out.println(name);
        totalcar++;
    }
    public static void showTotalCars(){
        System.out.println(totalcar);
    }
}
