package ch24_generic;

public class Generic6 {
    // 제네릭의 타입 경계(type bounds)
    // bounded type parameter
    // 상한(upper) 경계 : 타입 매개변수로 지정할 수 있는 타입을 특정 클래스의 자식 클래스나 특정 인터페이스의 구현 객체로 제한 가능
    static class Box<T extends Number> {
        // 필드
        T contents;

        // 세터 & 게터
        public void setContents(T contents) {
            this.contents = contents;
        }

        public T getContents() {
            return contents;
        }
    }

    public static void main(String[] args) {
        // Number 를 상속받은 타입 => 0
        Box<Integer> integerBox = new Box<>();      // 정수만 들어가는 Box
        Box<Double> doubleBox = new Box<>();        // 실수만 들어가는 Box

        // Box<String> stringBox = new Box<String>();
            // => Number 를 상속받지 않은 String 타입은 사용 불가!

    }

}
