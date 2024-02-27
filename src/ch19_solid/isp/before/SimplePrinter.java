package ch19_solid.isp.before;

public class SimplePrinter implements MultiFunctionPrinter{
    // 프린터 기능만 있는 단순 프린터
    @Override
    public void print() {
        // 프린트 로직
        System.out.println("프린트를 진행합니다.");
    }

    @Override
    public void scan() {
        System.out.println("스캔 기능은 지원되지 않습니다.");
    }

    @Override
    public void fax() {
        System.out.println("팩스 기능은 지원되지 않습니다.");
    }
}
