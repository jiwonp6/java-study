package ch19_solid.dip.after;

public class CreditCard implements Payment{
    // DIP 적용 후
    @Override
    public void processPayment(double amount){
        // 신용카드 결제 처리
        System.out.println("신용카드 결제를 진행합니다.");
    }
}
