package ch19_solid.isp.after;

public class SimplePrinter implements Printer {
    // 프린터 기능만 있는 단순 프린터 => 불필요한 메소드 구현하지 않아도 됨
    @Override
    public void print() {
        // 프린트 로직
        System.out.println("프린트를 진행합니다.");
    }
}
