package Section12.ex1;

public class AnimalSoundMain {

    static void main() {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 종료");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");

/*
        Cow[] cowArr = {cat, dog, cow}; //컴파일 오류 발생!
        System.out.println("동물 소리 테스트 시작");
        for (Cow cow : cawArr) {
            cowArr.sound();
        }
        System.out.println("동물 소리 테스트 종료");
*/
    }

    private static void soundCaw(Cow cow) {
        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
