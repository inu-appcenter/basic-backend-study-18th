package poly.basic;

public class PolyMain {
    public static void main(String[] args){
        System.out.println("parent -> parent");
        Parent pa = new Parent();
        pa.parentMethod();

        System.out.println("child->child)");
        Child ch = new Child();
        ch.parentMethod();
        ch.childMethod();

        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();


    }
}
