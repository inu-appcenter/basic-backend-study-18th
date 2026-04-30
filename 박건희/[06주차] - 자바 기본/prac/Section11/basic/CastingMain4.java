package Section11.basic;

public class CastingMain4 {

    static void main() {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;

        child1.childMethod(); //문제 없음
        Parent parent2 = new Parent();

        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        child2.childMethod(); //실행 불가

    }
}
