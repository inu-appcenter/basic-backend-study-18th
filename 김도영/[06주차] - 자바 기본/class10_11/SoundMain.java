package class10_11;

public class SoundMain{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal caw  = new Caw();

        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);

    }
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
