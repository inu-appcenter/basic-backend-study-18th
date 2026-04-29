package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); //메서드가 추상 메서드면 클래스도 메서드!
    //반드시 오버라이딩으로 사용

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
