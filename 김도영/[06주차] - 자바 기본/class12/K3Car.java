package class12;

public class K3Car implements Car{
    @Override
    public void startEngine(){
        System.out.println("k3 startEngine");
    }
    @Override
    public void offEngine(){
        System.out.println("k3 offEngine");
    }
    @Override
    public void pressAccelerator(){
        System.out.println("k3 pressAccelerator");
    }
}
