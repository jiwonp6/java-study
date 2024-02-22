package ch15_final.ex1;
// #14 final (2024-02-22)
public class Account {
    // 필드
    private final String accountNumber;
    private String ownerName;
    private long balance;
    private static final double INTEREST_RATE = 1.2;

    // 생성자
    public Account(String accountNumber, String ownerName, long balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 메소드
    public void printAccount(){
        System.out.println("계좌 : " + accountNumber + "\t이름 : " + ownerName
            + "\t잔액 : " + balance + "\t이자율 : " + INTEREST_RATE);
    }
}
