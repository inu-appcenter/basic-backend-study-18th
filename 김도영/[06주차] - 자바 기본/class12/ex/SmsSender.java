package class12.ex;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
