package ch18_interface.ex2;

public class CreditCard implements Payment{
    @Override
    public void pay(int price) {
        System.out.println("신용카드로 " + price + "원 결제되었습니다.");
    }
}
