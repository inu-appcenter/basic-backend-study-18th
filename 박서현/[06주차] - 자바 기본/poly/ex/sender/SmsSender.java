package poly.ex.sender;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String a) {
        System.out.println(a+"문자를 발송합니다.");
    }
}
