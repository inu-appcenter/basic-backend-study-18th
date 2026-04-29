package poly.basic;

public class CastingMain4 {
    static void main(String[] args) {
        Parent parent1 = new Child(); //가장 낮은 자식을 선언하면 조금 괜찮나?
        Child child = (Child) parent1;
        child.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류
        child2.childMethod(); //실행 안됨
    }
}
