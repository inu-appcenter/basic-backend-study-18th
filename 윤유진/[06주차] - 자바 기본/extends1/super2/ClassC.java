package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        //super(); //B는 기본 생성자를 직접 정의했기 때문에 불가
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
