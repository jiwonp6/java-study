package ch19_solid.ocp.after;

public class NaverPayPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("네이버페이 결제");
    }
}
