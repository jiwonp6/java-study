package ch01_variable;
//#2-10 이스케이프 문자(2024-02-07)
public class Escape {
    public static void main(String[] args) {
        /*
            이스케이프 문자
            - 문자열 내부에 역슬래시가 붙은 문자
            - 문자열 내부에서 특정 문자 포함 가능
         */
        // ex) String str = "나는 "자바"를 좋아합니다";
        String str = "나는 \"자바\"를 좋아합니다";

        System.out.println(str);
        
        // 탭문자 \t
        System.out.println("번호\t이름\t직업");

        // 줄 바꿈 \n
        System.out.println("문자열 내부에서 \n줄을 바꿉니다.");

        // 역스래시\\
        System.out.println("역슬래시\\");
    }
}
