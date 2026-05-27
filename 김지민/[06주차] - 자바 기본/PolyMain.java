class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
class Child extends Parent {
    @Override
    public void parentMethod() {
        System.out.println("Child.childMethod");
    }
}

public class PolyMain {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.parentMethod();

        parent = child;
        parent.parentMethod();
    }
}