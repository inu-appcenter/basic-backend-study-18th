package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
     parent.parentMethod();
     //child 인스턴스인 경우 childMoethod() 실행
     if(parent instanceof Child child) { //자바 16부터 가능해짐
         //instance of는 오른쪽에 있는 타입에 왼쪽에 있는 인스턴스의 타입이 들어갈수있는지 대입해봐라
         System.out.println("인스턴스 맞음");
         child.childMethod();
     }
    }
}
