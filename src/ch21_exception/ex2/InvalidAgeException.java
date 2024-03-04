package ch21_exception.ex2;

import java.util.Scanner;

public class InvalidAgeException extends Exception{
    /*
        <사용자 정의 예외와 예외 떠넘기기>

        요구사항:
        InvalidAgeException 이라는 사용자 정의 예외를 생성합니다.
        사용자로부터 나이를 입력받는 프로그램을 작성합니다.
        나이가 18세 미만일 경우, InvalidAgeException 을 발생시키고 "미성년자는 접근할 수 없습니다."라고 출력합니다.
        이 예외는 메소드를 호출한 곳에서 처리해야 합니다(throws 사용).

        예상 실행 결과
        ===
        나이를 입력하세요: 16
        미성년자는 접근할 수 없습니다.

        나이를 입력하세요: 20
        접근이 허용되었습니다.
     */

    // 생성자
    public InvalidAgeException(String message) {
        super(message);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        try {
            if (age < 20){
                throw new InvalidAgeException("미성년자는 접근할 수 없습니다.");
            } else {
                System.out.println("접근이 허용되었습니다.");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close(); // 리소스 종료
        }
    }
}
