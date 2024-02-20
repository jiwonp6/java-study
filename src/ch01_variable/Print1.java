package ch01_variable;
//#2-16 시스템 출력장치로 매개변수를 출력(2024-02-07)
public class Print1 {
    public static void main(String[] args) {
        // 출력 + 행(ln)변경
        System.out.println("println1");
        System.out.println("println2");
        
        // 출력 (행 변경 X)
        System.out.print("print1");
        System.out.print("print2");
        
        System.out.print("\n");

        // 형식문자열 출력
        System.out.printf("이름 : %s", "홍길동");
        System.out.print("\n");

        /*
            자주 사용되는 형식 문자열
            %s : 문자열    %10s : 열자리 문자열 형식
            %d : 정수     %10d : 열자리 정수
            %f : 실수     %10f : 열자리 실수,     %10.2 : 소숫점 2째자리까지
         */
        System.out.printf("%10s", "홍길동");
        System.out.print("\n");
        System.out.printf("%10d", 100);
        System.out.print("\n");
        System.out.printf("%10.2f", 20.0);      // 기본 소수점 값 6자리

    }
}
