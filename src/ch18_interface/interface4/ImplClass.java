package ch18_interface.interface4;

public class ImplClass implements First, Second{
    // First 인터페이스에서 가져온 메소드
    @Override
    public void firstMethod() {
        System.out.println("firstMethod");
    }

    // First, Second 이름이 똑같아도 빈 메소드이기 때문에 불러올 때 상관 X (구현은 구현 클래스에서!)
        // => 다이아몬드 문제가 발행하지 않음
    @Override
    public void commonMethod() {
        System.out.println("first, second 공통");
    }
    // Second 인터페이스에서 가져온 메소드
    @Override
    public void secondMethod() {
        System.out.println("secondMethod");
    }

    //
}
