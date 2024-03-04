package ch21_exception.throws3;

public class WrongMonthException extends RuntimeException{
    // RuntimeException 을 상속받으면 컴파일 단계에서 예외처리를 강제하지 않는 
    // unchecked exception 을 사용자 정의할 수 있다.
    
    // 생성자 오버로딩
    public WrongMonthException(int month){
        // 부모 예외 클래스의 생성자를 호출
        super("%s월은 존재하지 않습니다.".formatted(month));
    }
}
