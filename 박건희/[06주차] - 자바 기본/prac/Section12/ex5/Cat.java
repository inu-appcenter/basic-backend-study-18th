package Section12.ex5;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("그르릉");
    }
    @Override
    public void move() {
        System.out.println("고양이 이동");
    }

}
