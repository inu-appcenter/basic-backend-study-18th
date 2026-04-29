package poly.ex.sender;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String s) {
        System.out.println("FaceBook " + s);
    }
}
