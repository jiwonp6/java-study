package ch22_library.lang.ex.ex1;

public class BankAccount {
    String accountNum;
    String name;
    int balance;

    public BankAccount(String accountNum, String name, int balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌 번호 : %s, 소유자명 : %s, 현재 잔액 : %d".formatted(accountNum, name, balance);
    }
}
