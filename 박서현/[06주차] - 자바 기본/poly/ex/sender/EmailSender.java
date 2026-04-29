package poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String a) {
        System.out.println(a+"메일을 발송합니다.");
    }
}
