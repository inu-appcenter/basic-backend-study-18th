interface InterfaceAnimal {
    void sound();
    void move();
}
class Dog implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    @Override
    public void move() {
        System.out.println("개 이동");
    }
}
class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐옹");
    }
    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
public class InterfaceMain {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        soundAnimal(cat);
        soundAnimal(dog);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}