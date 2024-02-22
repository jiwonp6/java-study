package ch15_final.ex1;
// #14 final (2024-02-22)
public class Ex1 {
    /*
        은행시스템
        계좌 Account 클래스
        필드는
        accountNumber 고유한 계좌번호
        ownerName 소유자 이름
        balance 잔액
        interestRate 불변 고정 이자

        생성자 : 3가지 필드 사용

        메서드 : 필드 내용을 출력하는 정보 출력 메서드
     */
    public static void main(String[] args) {
        Account account = new Account("00-0000-0", "홍길동", 1000);

        account.printAccount();
    }
}
