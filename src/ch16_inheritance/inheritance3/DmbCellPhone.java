package ch16_inheritance.inheritance3;
// #15 상속 (2024-02-22)
public class DmbCellPhone extends CellPhone{
    // 필드(Super Class의 필드는 자동으로 모두 가짐)
    int channel;        // 새로운 필드 추가

    // 메소드(Super Class의 메소드는 자동으로 모두 가짐)
    void turnOnDmb(){       // 새로운 기능 추가
        System.out.println(channel + "번 DMB방송을 수신합니다.");
    }

    // 메소드 오버라이딩
    @Override
    void bell() {
        super.bell();       // 부모클래스의 메소드를 그대로 실행
    }
}
