package ch15_final.final2;
// #14 final (2024-02-22)
public class Constant {
    // 상수 : 변하지 않고 항상 일정한 값을 갖는 수
    // java에서는 static final 키워드를 사용해서 클래스 레벨의 상수를 선언
    // 대문자로 표기하는 것이 일반적이고, 밑줄로 _ 단어를 구분.

    // 변하지 않는 시간 관련 상수
    public static final double PI = 3.14159;
    public static final double E = 2.75896;
    public static final int HOURS = 24;
    public static final int MINUTES  = 60;
    public static final int SECONDS  = 60;

    // 프로그램에서 설정하는 상수
    public static final long MAX_USER = 10000;

    // 프로그램 전반에서 사용하기 때문에 public 접근제어자를 주로 사용한다. -> 전역적으로 접근 가능
    // 값을 한 군데에 모아서 관리할 수 있는 장점이 있음.
    // 프로그램 실행 중에는 상수 변경 불가. -> 프로그램 종료 후 변경하고 다시 실행해야 함
}
