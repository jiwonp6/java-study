package ch19_solid.dip.after;

public class DebitCard implements Payment{
    @Override
    public void processPayment(double amount){
        // 직불카드 결제 처리
        System.out.println("직불카드 결제를 진행합니다.");
    }
}
