package poly.ex2;

public class AnimalPolyMain1 {
    public static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);

    }

    private static void soundAnimal(Animal animal) { //코드의 핵심
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); //오버라이딩 된 메서드가 넘어와서 동물들의 울음소리가 나옴
        System.out.println("동물 소리 테스트 종료");
    }
}
