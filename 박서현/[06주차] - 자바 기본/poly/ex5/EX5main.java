package poly.ex5;

public class EX5main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow caw = new Cow();
        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
