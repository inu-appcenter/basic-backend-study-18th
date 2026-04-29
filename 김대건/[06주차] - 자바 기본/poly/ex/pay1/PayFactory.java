package poly.ex.pay1;

import java.util.HashMap;
import java.util.Map;

public class PayFactory {

    private static final Map<String, Pay> payMethods = new HashMap<>();

    static {
        register("kakao", new KakaoPay());
        register("naver", new NaverPay());
        register("toss", new TossPay());
    }

    public static void register(String option, Pay pay) {
        if (option == null || pay == null) {
            return;
        }
        payMethods.put(option.toLowerCase(), pay);
    }

    public static Pay getPay(String option) {
        if (option == null) {
            return null;
        }
        return payMethods.get(option.toLowerCase());
    }
}
