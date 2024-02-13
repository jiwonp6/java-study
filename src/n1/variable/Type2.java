package n1.variable;
//#2-6 변수 선언 타입(2024-02-07)
public class Type2 {
    public static void main(String[] args) {
        // 자바의 primitive type (기본 타입) ~ 8가지
        boolean boll = false;   // **
        char c = 'c';

        // 정수 (범위를 넘으면 컴파일 에러)
        byte b = 127;   // -128 ~ 127 (2^8만큼의 데이터를 저장) = 1byte
        short s = 32767;    // -32,768 ~ 32,767 (2^16만큼의 데이터를 저장) = 2byte
        int i = 32345488;    // -214,748,648 ~ 214,748,647 (2^32만큼의 데이터를 저장) = 4byte    **
        long l = 234578531235451L;    // (2^64만큼의 데이터를 저장) = 8byte     **
        
        // 실수
        float f = 10.0f;    // 데이터 정밀도 7자리 (4byte = 32bit)
        double d = 10.0;    // 데이터 정밀도 15자리 (8byte = 64bit)     **
        
        /*
            리터럴 (Literal) => 문자 그대로
            소스 코드에서 개발자가 직접 적은 고정된 프로그래밍 값
         */

    }
}
