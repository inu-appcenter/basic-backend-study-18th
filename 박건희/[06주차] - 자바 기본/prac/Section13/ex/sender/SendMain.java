package Section13.ex.sender;

public class SendMain {

    static void main() {

        Sender[] senders = {new EmailSender(), new SmsSender(), new
                FaceBookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("환영합니다!");
        }
    }
}
