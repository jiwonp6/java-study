package ch24_generic;

public class Generic1 {
    public static void main(String[] args) {
        Box box = new Box();

        box.content = "문자열";   // 모든 종류의 데이터 대입 가능
        // box.content.length();    // Object 타입은 자식 객체의 메소드 정보를 가지고 있지 않다.
        int length = ((String) box.content).length();// 자식 타입의 메소드 사용하려면 강제로 캐스팅해야 한다.

        // 다른 타입이 들어갈 경우 타입 체크를 해야 한다.
        box.content = Integer.valueOf(10);
        if (box.content instanceof String){
            System.out.println(((String) box.content).length());
        } else {
            System.out.println("String 타입이 아닙니다.");
        }

        // 필드에 접근할 경우 Object 리턴 => 강제 캐스팅, 타입 체크 필요
        Object content = box.getContent();
        // content.length();
    }

    static class Box {
        // Object는 최상위 클래스 -> 모든 객체 대입 가능
        public Object content;      // 모든 타입 담을 수 있음.

        public Object getContent() {
            return content;
        }
    }

}


