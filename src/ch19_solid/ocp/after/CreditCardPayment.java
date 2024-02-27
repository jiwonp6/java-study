package ch19_solid.ocp.after;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("신용카드 결제");
    }
}
