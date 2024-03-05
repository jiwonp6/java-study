package ch22_library.ex2;

public class Ex2 {
    /*
        Click 클래스는 x좌표, y좌표, 시간(timestamp : int타입)을 저장하는 클래스
        실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다라고 인정되게끔
        eqauls메서드를 overriding 해서 메인메서드로 확인해보세요.
     */
    public static void main(String[] args) {
        Click click1 = new Click(1.5, 2.0, 5);
        Click click2 = new Click(1.5, 2.0, 5);
        Click click3 = new Click(1.5, 2.0, 7);
        Click click4 = new Click(2.0, 1.5, 5);
        Click click5 = null;

        System.out.println("click1과 click2 비교 : " + click1.equals(click2));
        System.out.println("click1과 click3 비교 : " + click1.equals(click3));
        System.out.println("click1과 click4 비교 : " + click1.equals(click4));
        System.out.println("click1과 click5 비교 : " + click1.equals(click5));
    }
}
