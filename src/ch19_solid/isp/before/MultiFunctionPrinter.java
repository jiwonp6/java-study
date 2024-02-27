package ch19_solid.isp.before;

public interface MultiFunctionPrinter {
    // ISP (인터페이스 분리 원칙 적용) 전
    // 단순한 출력 기능만 있는 프린터도 모든 기능 구현이 강제된다.
    void print();
    void scan();
    void fax();
}
