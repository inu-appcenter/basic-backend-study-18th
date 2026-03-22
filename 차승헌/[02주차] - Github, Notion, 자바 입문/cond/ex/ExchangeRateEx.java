package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args){
        int dollar=1;
        int rate = 1300;
        int exchang =0;

        if (dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if(dollar==0){
            System.out.println("환전할 금액이 없습니다");
        } else if (dollar > 0){
            exchang= dollar*rate;
            System.out.println("환전 금액은 "+ exchang + "원입니다");
        }
    }
}
