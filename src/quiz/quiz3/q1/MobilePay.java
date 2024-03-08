package quiz.quiz3.q1;

public class MobilePay implements Payment{
    @Override
    public void pay(int price) {
        System.out.printf("모바일페이로 %d원 결제되었습니다.\n", price);
    }
}
