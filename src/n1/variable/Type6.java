package n1.variable;
//#2-14 문자열 연산 자동 타입 변환(2024-02-07)
public class Type6 {
    public static void main(String[] args) {
        // "문자열" + 숫자 => "문자열숫자"
        // "숫자" + 문자열=> "숫자문자열"
        System.out.println( 3 + 7 );    // 10
        System.out.println( "3" + 7 );  // "37"
        System.out.println( 3 + "7" );  // "37"

    }
}
