package ch18_interface.ex2;

public class MobilePay implements Payment{
    @Override
    public void pay(int price) {
        System.out.println("모바일 결제로 " + price + "원 결제되었습니다.");
    }
}
