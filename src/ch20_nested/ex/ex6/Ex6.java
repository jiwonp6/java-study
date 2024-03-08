package ch20_nested.ex.ex6;

public class Ex6 {
    /*
        문제 6.
        다음 메인 메소드의 실행결과를 출력하는 Vehicle 클래스와 Anonymous 클래스를 익명 인터페이스 구현 객체를 이용하여 만들어주세요.


        출력예시
        ===
        자전거가 달립니다.
        승용차가 달립니다.
        트럭이 달립니다.
     */
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        //익명 객체 필드 사용
        anony.bicycle.run();
        //익명 객체 로컬변수 사용
        anony.method1();
        //익명 객체 매개값 사용
        anony.method2(new Vehicle() {
            @Override
            public void run() {
                System.out.println("트럭이 달립니다.");
            }
        });
    }
}
