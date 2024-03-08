package quiz.quiz2.q5;

public class FacebookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("iMessage 발송 성공 : " + message);
    }
}
