package ch28_thread;

public class Thread11_Account {
    // <공유 자원의 문제>
    // 하나의 계좌 자원에서 동시에 스레드가 접근할 때
    // 경쟁 상태 발생 -> synchronized 사용!
    public static void main(String[] args) {
        Account account = new Account(10000);

        Thread thread1 = new Thread(() -> {
            account.deposit(5000);
            account.withdraw(7000);
            account.withdraw(10000);
        }, "철수");

        Thread thread2 = new Thread(() -> {
            account.deposit(3000);
            account.withdraw(9000);
            account.withdraw(5000);
        }, "영희");

        // thread1.start();
        // thread2.start();

        Thread thread3 = new Thread(() -> {
            account.deposit2(5000);
            account.withdraw2(7000);
            account.withdraw2(10000);
        }, "철수");

        Thread thread4 = new Thread(() -> {
            account.deposit2(3000);
            account.withdraw2(9000);
            account.withdraw2(5000);
        }, "영희");

        thread3.start();
        thread4.start();


    }
}
