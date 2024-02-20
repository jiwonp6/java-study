package ch12_accessModifier.ex2.com.bank.system;
// #11 접근제한자 (2024-02-20)
public class Account {
    /* 필드 : 데이터 */
    private double balance;

    /* 생성자 */
    public void account(){}

    /* 메소드 */
    // getter
    public double getBalance() {
        return balance;
    }
    // setter
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // 입금
    public double deposit(double balance, double amount){
        balance += amount;
        System.out.println("입금 후 잔액 : " + balance);
        return balance;

    }

    // 출금
    public double withdraw(double balance, double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("출금 후 잔액 : " + balance);

        }else {
            System.out.println("출금 시도 : " + amount + " (잔액이 부족합니다.)");
        }
        return balance;

    }
}
