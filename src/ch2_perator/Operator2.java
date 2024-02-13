package ch2_perator;
//#3-2 문자열 더하기 (2024-02-08)
public class Operator2 {
    public static void main(String[] args) {
        // 문자열에도 + 연산자를 사용하여 연결할 수 있다.
        String str1 = "hello" + "java";
        System.out.println("str = " + str1);

        // 문자열과 숫자 더하기
        String str2 = "20";
        int str3 = 10;
        System.out.println("str2 + str3 = " + str2 + str3);     // 30(X), 2010(O)

    }
}
