package class12.ex.pay1;

public class PayMain1 {
    static void main(String[] args) {
        PayService payService = new PayService();

        // kakao
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        // naver
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        // new
        String payOption3 = "new";
        int amount3 = 10000;
        payService.processPay(payOption3, amount3);

        // 잘못
        String payOption4 = "bad";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);
    }
}
