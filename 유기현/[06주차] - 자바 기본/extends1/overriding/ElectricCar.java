package extends1.overriding;

public class ElectricCar extends Car {

    @Override //메서드 오버라이딩 제약을 걸어준다.
    public void move() { //오버라이딩이 없어도 됨
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
        //하나의 자식에게 2명의 부모는 없다.
    }
}
