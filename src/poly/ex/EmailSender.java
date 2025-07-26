package poly.ex;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("이메일을 발송합니다. "+message);
    }
}
