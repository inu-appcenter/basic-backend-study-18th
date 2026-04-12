package Section12.diamond;

public class DiamondMain {

    static void main() {

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
