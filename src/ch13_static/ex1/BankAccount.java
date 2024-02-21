package ch13_static.ex1;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class BankAccount {
    // 필드
    private String accountId = "";
    private long balance;

    private static int count;

    // 생성자
    public BankAccount() {
        this.accountId = getAccountId() + (++count);
            // -> count++가 id만들면서 이미 증가하기 때문에 밑에 따로 count++해줄 필요가 없음
    }


    // 메소드
    // 게터 & 세터
    public static int getCount() {
        return count;
    }

    public String getAccountId() {
        return accountId;
    }

    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    // 생성된 accountId 전체 개수 반환(계좌 수)
    public static int countAccountId(){
        return count;
    }

    // deposit
    public void deposit(double amount){
        balance += amount;
    }

    // withdraw
    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("출금 불가");
            return;
        }
        balance -= amount;
    }

}
