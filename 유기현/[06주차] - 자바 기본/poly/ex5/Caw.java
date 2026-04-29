package poly.ex5;

public class Caw implements InterFaceAnimal{
    @Override
public void sound() {
    System.out.println("멍멍");
}

    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
