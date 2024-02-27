package ch19_solid.dip.after;

public class PaymentProcessor {
    // 결제 처리 프로세서
    // 구체적인 Detail에 의존하지 않고, 추상화에 의존하게 됨.
    // 필드
    private Payment payment;

    // 결제 방식을 추가하게 되더라도, 클래스를 수정할 필요가 없게 됨.
    // Payment 인터페이스에 의존
    void processPayment(double amount){
        payment.processPayment(amount);
    }

}
