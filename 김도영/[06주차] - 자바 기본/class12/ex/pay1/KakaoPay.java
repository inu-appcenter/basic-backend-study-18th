package class12.ex.pay1;

public class KakaoPay implements Pay{
    @Override
    public boolean pay(int amount){
        System.out.println("카카오 페이 시스템 연결");
        System.out.println(amount+"원 결제 시도");
        return true;
    }
}
