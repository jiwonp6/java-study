package ch22_library.ex1;

public class Ex1 {
    /*
        은행 계좌 정보를 관리하는 BankAccount 클래스가 있다고 가정해 보겠습니다.
        계좌 번호와 소유자 이름, 현재 잔액을 포함하는 toString() 메소드를 오버라이드하여 구현할 수 있습니다.
     */
    public static void main(String[] args) {
        BankAccount account1= new BankAccount("1234-56-789", "홍길동", 10000);
        System.out.println(account1);

        BankAccount account2= new BankAccount("1212-34-567", "박길동", 5800);
        System.out.println(account2);

    }
}
