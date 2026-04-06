package cond.ex;

public class DistanceEx {

    public static void main(String[] args) {

        int distance = 0;
        String transport;

        if(distance > 100){
            transport = "비행기";
        } else if (distance > 10) {
            transport = "자동차";
        } else if (distance > 1) {
            transport = "자전거";
        } else{
            transport = "도보";
        }
        System.out.println("이동수단은 " + transport + "입니다.");
    }
}
