package ch19_solid.ocp.after;

public class KakaoPayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("카카오페이 결제");
    }
}
