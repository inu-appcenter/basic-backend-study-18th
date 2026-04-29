package extends1.ex2;

public class ElectricCar extends Car{
    // extends -> (화살표 느낌)
    //car기능을 사용할 수 있다.
    public void charge() {
        System.out.println("충전합니다.");
        //하나의 자식에게 2명의 부모는 없다.
    }
}
