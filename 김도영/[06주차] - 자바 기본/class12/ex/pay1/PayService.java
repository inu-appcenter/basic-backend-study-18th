package class12.ex.pay1;

public class PayService {

    public void processPay(String option, int amount){
        System.out.println("결제 시작: 옵션="+option+"금액="+amount);

        Pay pay = PayStore.findPay(option);
        boolean result = pay.pay(amount);

        if(result){
            System.out.println("성공");
        }
        else {
            System.out.println("실패");
        }
    }
}
