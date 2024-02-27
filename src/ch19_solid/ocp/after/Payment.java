package ch19_solid.ocp.after;

public interface Payment {
    // OCP (개방 폐쇄 원칙) 적용 후
    // 결제 인터페이스 설계
    void processPayment();
}
