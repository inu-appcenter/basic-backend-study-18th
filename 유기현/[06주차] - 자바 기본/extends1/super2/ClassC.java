package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); //Class에 기본 생성자가 없어서 꼭 매개변수 넣어주기
        //여기서 super은 생략이 안된다.
        System.out.println("ClassC 생성자");
    }
}
