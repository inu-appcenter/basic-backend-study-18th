package poly.basic;

public class CastingMain4 {

    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); //생성된 객체가 자식 타입이 존재하기 않기 때문
        //Child child2 = (Child) parent2;
        //child2.childMethod();

    }
}
