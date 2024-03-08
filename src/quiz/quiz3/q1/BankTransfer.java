package quiz.quiz3.q1;

public class BankTransfer implements Payment{
    @Override
    public void pay(int price) {
        System.out.printf("계좌이체로 %d원 결제되었습니다.\n", price);
    }
}
