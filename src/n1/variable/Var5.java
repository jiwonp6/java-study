package n1.variable;
//#2-7 변수 명명법(2024-02-07)
public class Var5 {
    public static void main(String[] args) {
        /*
            변수 이름 짓는 규칙
            - 변수 이름은 숫자로 시작 X
                int 1abc; <- X
                int a1bc; <- O

            - 공백 X => 공백 이후 등장 단어는 대문자로 표기(낙타등 표기법)
                int order detail; <- X
                int orderDetail; <- O

            - 예약어 사용 X (ex. public, int, void, class, etc.)
            
            - 변수 이름에는 영문자, 숫자, $, _를 사용
                int $abc; <- O
                int a-bc; <- X
                int a_bc; <- O
         */
        /*
            변수 명명 관례
            - 자바에서 클래스 이름의 첫 글자는 대문자로 시작
            - 클래스 제외한 나머지는 모두 첫 글자를 소문자로 시작
            - 예외
                -> 상수는 모두 대문자 사용, 언더바(_)로 구분 (ex. USER_LIMIT, PI)
                -> 패키지 이름은 모두 소문자 사용
            - 변수 이름은 의미를 명확하게 전달 가능하도록
                -> 용도를 설명할 수 있어야 함.
         */

    }
}
