package ch22_library.lang.lang7_system;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {
        // System 클래스
            // : 객체 생성 X, 모든 멤버를 static 으로 클래스 이름을 통해 접근하여 사용,
            // 운영체제(OS)의 일부기능과 상호작용할 수 있는 것을 돕는다.
        // System system = new System();
        System.out.println();       // 표준 출력 PrintStream을 사용함

        // 필드
        InputStream in = System.in;     // 표준 입력 스트림 : 주로 키보드 입력받을 때 사용
        PrintStream out = System.out;   // 표준 출력 스트림 : 콘솔에 출력할 때 사용
        PrintStream err = System.err;   // 표준 오류 스트림 : 에러 메시지 출력할 때 사용

        System.err.println("-2. 에러가 발생했습니다.");  // 에러 메시지나 경고 메시지 표시에 사용, 에러 메시지는 마지막에 모아서 출력됨

        System.out.println("1. 시스템 클래스 사용합니다.");

        System.err.println("-1. 오류 메시지는 마지막에 출력되니 주의해 주세요.");

        // 메소드
        // 환경변수 조회
        Map<String, String> getenv = System.getenv();           // Map 자료 구조로 전체 환경 변수확인
        String path = System.getenv("PATH");              // key 값을 통해 개별 환경변수 문자열 반환
        System.out.println("2. 환경변수 : " + path);

        // 시스템 속성 조회
        Properties properties = System.getProperties();         // Properties 타입으로 시스템 속성 전체 반환
        String property = System.getProperty("os.name");        // key 값을 통해 시스템 속성 개별 문자열 반환
        System.out.println("3. 운영 체제 이름 : " + property);

        // 프로그램 종료
        System.exit(0);                                   // 정상종료 : 0 -> 일반적으로 종료될 때
        System.exit(1);                                   // 비정상종료 : 1 -> 0을 제외한 상태코드



    }
}
