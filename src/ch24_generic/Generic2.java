package ch24_generic;

public class Generic2 {
    // Generic
        // : 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때 파라미터를 구테적인 타입으로 대체하는 기능
    static class Box<T>{
        // 필드
        T content;

        // 게터
        public T getContent() {
            return content;
        }

    }

    public static void main(String[] args) {
        // 1. String
        Box<String> stringBox = new Box<String>();
        stringBox.content = "문자열";

        String strContent = stringBox.getContent();
        strContent.length();    // 캐스팅이 필요 없음

        // 2. Integer
        // 우측 항에서 타입은 추론 가능하기 때문에 생략 가능
        // Box<int> integerBox = new Box<>();   // 기본타입은 제네릭 대입 불가 => Wrapper(포장) 타입을 넣는다.
        Box<Integer> integerBox = new Box<>();
        // integerBox.content = "문자열";
        integerBox.content = 100;

        Integer intContent = integerBox.getContent();
        intContent.equals(100);

    }
}

