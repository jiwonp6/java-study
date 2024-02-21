package ch13_static.static1;
// #12 자바 메모리 영역 구조 (2024-02-21)
public class Data {
    // 필드
    private int field;

    // 생성자
    public Data() {
    }
    public Data(int field) {
        this.field = field;
    }

    // 메서드
    // 게터
    public int getField() {
        return field;
    }
}
