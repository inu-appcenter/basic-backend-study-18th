package poly.pay0;
public class PayService { // 결제수단을 추가해도 PayService의 코드에는 변함 없음
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        Payment payment = PayStore.findPay(option);
        boolean result = payment.pay(amount);

        isPaid(result);
    }

    private void isPaid(boolean result){
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
