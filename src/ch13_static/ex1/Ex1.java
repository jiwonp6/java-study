package ch13_static.ex1;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Ex1 {
    /*
        <은행 계좌 자동생성 클래스 만들기>
        BankAccount 클래스:

        각 BankAccount 객체는 고유한 계좌 ID(accountId)와 계좌 잔액(balance)을 가집니다.
        accountId는 계좌가 생성될 때 자동으로 설정되어야 하며, 모든 계좌에 대해 유니크해야 합니다.
        static 변수를 사용하여 생성된 전체 계좌 수를 추적합니다.
        static 메소드를 사용하여 현재까지 생성된 전체 계좌 수를 반환합니다.
        계좌 잔액을 변경하는 인스턴스 메소드(deposit, withdraw)를 포함합니다.

        Main 클래스:

        여러 개의 BankAccount 객체를 생성하고, 각 객체에 대한 정보(계좌 ID, 잔액)를 출력합니다.
        전체 계좌 수를 출력합니다.

        예상 실행결과
        ====
        계좌 1: 계좌 ID=1, 잔액=1000
        계좌 2: 계좌 ID=2, 잔액=2000
        ...
        전체 계좌 수: 2
     */
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setBalance(1000);
        System.out.println("계좌 ID : " + bankAccount1.getAccountId() + ", 잔액 : " + bankAccount1.getBalance());
        bankAccount1.deposit(100);
        System.out.println("계좌 ID : " + bankAccount1.getAccountId() + ", 잔액 : " + bankAccount1.getBalance());
        bankAccount1.withdraw(500);
        System.out.println("계좌 ID : " + bankAccount1.getAccountId() + ", 잔액 : " + bankAccount1.getBalance());

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.setBalance(2000);
        System.out.println("계좌 ID : " + bankAccount2.getAccountId() + ", 잔액 : " + bankAccount2.getBalance());


        // 계좌 생성
        System.out.println("전체 계좌 수 : " + BankAccount.getCount());
    }

}
