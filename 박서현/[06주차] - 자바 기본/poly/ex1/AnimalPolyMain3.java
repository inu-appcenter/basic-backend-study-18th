package poly.ex1;

public class AnimalPolyMain3 {
    public void mian(String[] args){
        animal[] arr = {new Dog(), new Cat(), new Cow()};
        for (animal a : arr){
            soundAnimla(a);
        }

    }

    private void soundAnimla(animal a){
        System.out.println("동물 소리 테스트 시작");
        a.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
