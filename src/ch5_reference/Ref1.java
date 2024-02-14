package ch5_reference;
// #6-1 기본타입 v.s. 참조타입 (2024-02-14)
public class Ref1 {
    public static void main(String[] args) {    // 메소드 영역 -> 스택영역

        /* 기본타입 */
        // int
        int i1 = 10;     // 변수 선언, 초기화 -> 스택 영역 : 10
        int i2 = 10;

        /* 참조타입 */
        // 문자열) 참조타입 -> 힙 영역의 0X100 번지 : "홍길동"
        String str1 = "홍길동";        // 변수 선언, 초기화 -> 스택영역 : 0X100 (메모리 주소)
        String str2 = "홀길동";

        // new 연산자 : 객체를 생성하는 연산자) 참조타입 -> 힙 영역의 0X200 번지 : "박길동"
        String str3 = new String("박길동");        // 변수 선언, 초기화 -> 스택영역 : 0X200 (메모리 주소)
        String str4 = new String("박길동");        // 스택영역 : 0X300 (메모리 주소)

        /* 비교 */
            // ==, != 연산은 변수의 값이 같은지 아닌지를 비교
            // 참조타입의 경우 동일한 객체를 참조하는지 아닌지를 비교
        // 기본타입
        if (i1 == i2){      // 값이 같음 -> 기본 타입은 값 그 자체로 저장되고, 비교하기 때문
            System.out.println("i1과 i2는 값이 같음");
        } else {
            System.out.println("i1과 i2는 값이 다름");
        }

        // 참조타입 - String
        if (str1 == str2){  // 값이 다름 -> 주소지를 비교하기 때문 | 0X100 != 0X200
            System.out.println("str1과 str2는 값이 같음");
        } else {
            System.out.println("str1과 str2는 값이 다름");
        }

        // 참조타입 - new String
        if (str3 == str4){  // 값이 다름 -> 주소지를 비교하기 때문 | 0X200 != 0X300
            System.out.println("str3과 str4는 값이 같음");
        } else {
            System.out.println("str3과 str4는 값이 다름");
        }

        if (str3.equals(str4)){     // => 문자열을 비교할 때는 equals 사용!
            System.out.println("str3와 str4는 문자열이 같음");
        }

    }
}
