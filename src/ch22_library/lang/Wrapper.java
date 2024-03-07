package ch22_library.lang;

public class Wrapper {
    // 래퍼 클래스 = 자바의 기본 타입 값을 갖는 객체를 생성(포장)하는 클래스
    // 기본 타입 : 메모리 주소에 값이 대입되고 성능이 좋다.
    // 기본 타입의 값은 외부에서 변경 불가, 메소드 사용X
    public static void main(String[] args) {
        // 1. 기본 타입 (8)
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8;
        float f = 4.0f;
        double d = 8.0;
        boolean bool = false;
        char c = 'a';
        // int iNull = null; <- null 값 불가능
        // 컬렉션 프레임워크에 기본 데이터 값을 저장할 수 없다.
        // i. <- . 으로 메소드 X

        // 2. 포장 타입 (Wrapper Type)
        Byte aByte = 1;
        Short aShort = 2;
        Integer integer = 4;
        Long aLong = 8L;
        Float aFloat = 4.0f;
        Double aDouble = 8.0;
        Boolean aBoolean = true;
        Character character = 'C';
        Integer integernull = null;     // null값을 가질 수 있다.
        // integer. <- . 으로 다양한 메소드에 접근 가능
        // 컬렉션 프레임워크에 값을 저장할 수 있다.

        // 3. 기본 타입과 포장 타입을 변환하는 과정 : Boxing, UnBoxing
        // (1) Boxing : 기본 타입 -> 포장 타입
        int intPrimitive = 10;
        Integer intWrap = Integer.valueOf(intPrimitive);

        // (2) Unboxing : 포장 타입 -> 기본 타입
        int unboxedInt = intWrap.intValue();

        // (3) 자동 Boxing : 명시적으로 선언하지 않아도 자동으로 포장
        // 컴파일러에서 자동으로 처리
        Integer autoWrap = intPrimitive;

        // (4) 자동 Unboxing
        // 컴파일러에서 자동으로 처리
        int autoUnboxedInt = autoWrap;

        // ※ 자동 Boxing 과 Unboxing 은 성능상으로 떨어질 수 있으니 반복문 등에서는 자제

        // 혼합하여 연산 가능
        int calculatedInt = intPrimitive + intWrap;
        Integer calculatedInt2 = intPrimitive + intWrap;

        // 유용한 메소드
        // 문자열로부터 래퍼 객체 변환
        Integer intValue = Integer.valueOf("1004");

        // 숫자 자료형들에 존재하는 기본 타입 파싱 메소드
        int parsedInt = Integer.parseInt("100");
        long parsedLong = Long.parseLong("10000000000000");
        double parsedDouble = Double.parseDouble("1000.1212");

        // 문자 자료형 메소드
        String str = "문자열Ab1 .";
        for (int j = 0; j < str.length(); j++) {
            Character ch = str.charAt(i);
            boolean letter = Character.isLetter(ch);
            boolean digit = Character.isDigit(ch);
            boolean spaceChar = Character.isSpaceChar(ch);
            boolean emoji = Character.isEmoji(ch);
            boolean upperCase = Character.isUpperCase(ch);
            boolean lowerCase = Character.isLowerCase(ch);
        }
    }
}
