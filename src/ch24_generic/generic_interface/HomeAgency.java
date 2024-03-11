package ch24_generic.generic_interface;

public class HomeAgency implements Rentable<Home> {
    // 집 대여해주는 대리점 클래스

    // 타입 파라미터 T -> Home 으로 대체가 됨
    @Override
    public Home rent() {
        System.out.println("집을 렌트합니다.");

        // 리턴 타입도 구체화된 클래스로 변경
        return new Home();
    }
}
