package ch18_interface.ex2;

public class BankTransfer implements Payment{
    @Override
    public void pay(int price) {
        System.out.println("계좌이체로 " + price + "원 결제되었습니다.");
    }
}
