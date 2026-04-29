package static2.ex;

public class Car {
    String car;
    static int count;

    public Car(String car){
        this.car = car;
        count++;
        System.out.println("차량 구입, 이름: "+ this.car);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수:"+count);
    }
}
