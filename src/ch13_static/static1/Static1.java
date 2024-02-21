package ch13_static.static1;

import ch13_static.static1.Data;

// #12 자바 메모리 영역 구조 (2024-02-21)
public class Static1 {
    // 메소드 영역에 관련 클래스 정보와 메소드 정보가 메모리에 올라간다.
    // #1) 자바 프로그램이 실행되면서 Entry Point(집입점 : main 함수)를 찾는다.
    // #2) 스택에 메인 메소드 프레임이 생성된다.
    public static void main(String[] args) {
        System.out.println("1. 메인 메소드 시작");
        staticMethod1();                            // 스태틱 메소드 1 호출 -> 스택 프레임 생성
        System.out.println("6. 메인 메소드 끝");
    }

    static void staticMethod1(){
        System.out.println("2. 메소드1 시작");
        // -> 새로운 클래스의 정보를 메소드 영역에 저장한다.
        Data data = new Data(100);              // 힙영역에 객체 생성
        // -> 메소드 영역의 생성자 정보에 접근하여 생성자 함수 실행
        // -> 스택영역의 data 변수에 생성된 메모리 구조를 바인딩
        staticMethod2(data);                        // 스택 영역에 메소드 호출 + 스택 프레임 생성
        // -> 메소드 2 스택 프레임의 매개변수로 data의 참조값을 dataParam에 복사하여 전달
        System.out.println("5. 메소드1 끝");
        // -> 메소드1 스택프레임이 제거된다. data 변수도 프레임과 함께 제거
        // 더 이상 Data(100) 객체를 참조하는 변수가 하나도 남아있지 않게 됨
        // GC가 객체도 제거함
    }
    static void staticMethod2(Data dataParam){
        System.out.println("3. 메소드2 시작");
        System.out.println("데이터 객체의 필드 : " + dataParam.getField());
        // -> 힙영역의 dataParam의 참조값에 접근한다.
        // -> 메소드 영역(공유영역)의 Data 클래스의 getField 메소드 코드에 접근한다.
        System.out.println("4. 메소드2 끝");
        // -> 메소드2 스택프레임이 제거된다. dataParam 변수도 프레임과 함께 제거
    }
}
