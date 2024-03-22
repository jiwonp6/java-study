package ch28_thread;

public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    // <공유 자원>
    // 입금
    public void deposit (int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + "가 " + amount + "원을 입금했습니다.(잔고 : " + balance + ")");
    }
    // 출금
    public void withdraw (int amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "가 " + amount + "원을 출금했습니다.(잔고 : " + balance + ")");
        } else {
            System.out.println(Thread.currentThread().getName() + "님의 통장 잔액이 부족합니다.(잔고 : " + balance + ")");
        }
    }

    // <synchronized>
        // : 메소드 전체를 동기화
        // 메소드가 포함하는 모든 코드에 대해서 한 번에 하나의 스레드만 접근 가능
    // 입금
    public synchronized void deposit2 (int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + "가 " + amount + "원을 입금했습니다.(잔고 : " + balance + ")");
    }
    // 출금
    public synchronized void withdraw2 (int amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + "가 " + amount + "원을 출금했습니다.(잔고 : " + balance + ")");
        } else {
            System.out.println(Thread.currentThread().getName() + "님, 통장의 잔액이 부족합니다.(잔고 : " + balance + ")");
        }
    }

}
