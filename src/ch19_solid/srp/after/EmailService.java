package ch19_solid.srp.after;

public class EmailService {
    // SRP(단일 책임 원칙) 적용 후
    // 이메일 관련 책임만 가짐
    public void sendEmail(Employee employee){
        System.out.println("이메일을 보냅니다.");
    }
}
