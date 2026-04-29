package class12;

public class Driver {
    private K3 k3;
    private ModelK3 modelK3;

    public void setk3(K3 k3){
        this.k3 = k3;
    }

    // 추가
    public void setModelK3(ModelK3 modelK3){
        this.modelK3 = modelK3;
    }

    public void drive(){
        System.out.println("drive");
        if(k3 != null){
            k3.startEngine();
            k3.pressAccelerator();
            k3.offEngine();
        }
        else if(modelK3 != null){
            modelK3.startEngine();
            modelK3.pressAccelerator();
            modelK3.offEngine();
        }
    }
}
