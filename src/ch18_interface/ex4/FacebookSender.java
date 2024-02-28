package ch18_interface.ex4;

public class FacebookSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("iMessage 발송 성공 : " + message);
    }
}
