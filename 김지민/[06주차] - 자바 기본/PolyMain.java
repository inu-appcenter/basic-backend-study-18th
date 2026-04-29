class Parent {
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
class Child extends Parent {
    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}

public class PolyMain {
    public static void main(String[] args) {

        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
    }
}