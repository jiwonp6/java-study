package ch05_reference;
// #6-2 참조타입 (2024-02-14)
public class Ref2 {
    public static void main(String[] args) {
        /*
            null : 참조타입의 변수가 객체를 참조하지 않는다는 것을 나타내는 값
            null 값을 가진 참조 타입 변수
            1. 변수가 초기화되지 않았을 때
            2. 객체가 명시적으로 null 값으로 설정되었을 때
            3. 객체가 메모리에서 삭제되었을 때
         */

        String str1;     // 변수 선언, 초기화 X => null
        String str2 = null;     // 객체가 명시적으로 null 값으로 설정

        // NullPointerException(NPE) : 참조 타입의 변수가 null 값 가진 경우, 메서드나 필드에 접근하려 할 때 발생 하는 예외
        str2.length();      // 컴파일 단계에서 확인X, 실행 단계(런타입)에서 확인O
        
        // NPE 방지 (예외처리)
        if (str2 != null){
            str2.length();
        }else {
            System.out.println("str2는 NULL");
        }
        


    }
}
