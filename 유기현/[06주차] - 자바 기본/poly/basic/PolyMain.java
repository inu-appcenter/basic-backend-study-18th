package poly.basic;

public class PolyMain {
    public static void main(String[] args) {

        //부모 뵨수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모변수가 자식 인스턴스 참조(다형성 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child(); //Child를 생성하면 둘다 생성 된다.!!
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다.
        //poly.childMethod();
    }
}
