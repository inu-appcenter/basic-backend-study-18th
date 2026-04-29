package class12.ex;

public class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
