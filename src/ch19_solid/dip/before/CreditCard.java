package ch19_solid.dip.before;

public class CreditCard {
    // DIP 적용 전
    void processPayment(double amount){
        // 신용카드 결제 처리
        System.out.println("신용카드 결제를 진행합니다.");
    }
}
