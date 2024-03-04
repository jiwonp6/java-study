package quiz2.q5;

public class Quiz5 {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FacebookSender()};
        for (Sender sender : senders) {
            sender.sendMessage("다중 메시지 전송 테스트입니다.");
        }
    }
}
