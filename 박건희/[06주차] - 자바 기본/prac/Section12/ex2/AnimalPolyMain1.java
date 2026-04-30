package Section12.ex2;

public class AnimalPolyMain1 {

    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow caw = new Cow();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cat);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
