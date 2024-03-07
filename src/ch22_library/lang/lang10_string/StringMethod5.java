package ch22_library.lang.lang10_string;

public class StringMethod5 {
    public static void main(String[] args) {
        // <문자열에서 자주 사용되는 메소드>

        // 13. concat : 문자열 연결 <--- concat 메소드가 사용될 때마다 문자열이 새로 생성된다. (문자열 = 불변객체)
                                     // 내부적으로 더 효율적인 방법 => StringBuffer, StringBuilder
        String la1 = "La La La LoveSong";
        String la2 = "Ra Ra";
        String la3 = "La ra la";

        String la123 = la1 + la2 + la3;                     // "La La La LoveSongRa RaLa ra la"
        String la12 = la1.concat(la2);                      // "La La La LoveSongRa Ra"

        String la123Concat = la1.concat(la2).concat(la3);   // "La La La LoveSongRa RaLa ra la"

        // 14. StringBuffer, StringBuilder : 변경이 가능한 문자열 활용 가능
        StringBuffer stringBuffer;                          // 다중 스레드 환경일 때 사용
        StringBuilder stringBuilder;                        // 단일 스레드 환경일 때 사용 (성능이 더 좋음)

        // 15. append (메소드 체이닝 기법) : 문자열 뒤에 내용을 추가하고 StringBuilder 타입을 return, 최종 문자열을 반환하고 싶을 때는 toString();
        StringBuilder sb =  new StringBuilder();
        String append = sb.append(la1)
                          .append(la2)
                          .append(" ")
                          .append(la3)
                          .toString();

        // ※ concat v.s. append
        // concat : 문자열 이외의 다른 타입 X
                 // "가", "나", "다", "가나", "가나다"
                 // (메모리 상 총 5개의 문자열이 생성되어 공간을 차지)
        String concat = "가".concat("나")
                            .concat("다");
                          //.concat(10);    <--- 에러

        // append : 문자열 이외의 다른 타입 O
                 // "가", "나", "다", "가나다"
                 // (메모리 상 총 4개의 문자열이 생성되어 공간을 차지)
        StringBuilder builder = new StringBuilder("가").append("나")
                                                       .append("다")
                                                       .append(10);  // "가나다10"

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.append(" Java");
        System.out.println(sb2.toString());     // "Hello Java"

        // 16. insert : 특정 위치에 문자열 삽입
        sb2.insert(5, " World");
        System.out.println(sb2.toString());     // "Hello World Java"

        // 17. delete : 특정 위치 문자열 삭제
        sb2.delete(5, 11);
        System.out.println(sb2.toString());     // "Hello Java"

        // 18. reverse : 문자열 뒤집기
        sb2.reverse();
        System.out.println(sb2.toString());     // "avaJ olleH"

        // 생성 후에도 문자열 변경 가능, 새로운 객체 생성 X


    }
}
