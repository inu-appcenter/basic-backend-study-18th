package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String a) {
        System.out.println(a+"페이스북을 발송합니다.");
    }
}
