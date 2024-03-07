package ch22_library.util.ex;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    /*
        <랜덤 비밀번호 생성기>
        [요구사항]
        사용자로부터 비밀번호의 길이를 입력받아, 해당 길이를 가진 랜덤 비밀번호를 생성하는 프로그램을 작성하세요.
        비밀번호는 대문자, 소문자, 숫자를 포함해야 합니다.

        [입력 예시]
        8

        [출력 예시]
        생성된 비밀번호: X7gA2fHq

        [힌트]
        비밀번호에 사용될 문자 세트
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
     */
    public static void main(String[] args) {
        Random random = new Random();
        String charSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder pw = new StringBuilder();
        StringBuilder madePw = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("비밀번호 길이 : ");
        int pwLength = scanner.nextInt();

        char[] pwChar = new char[charSet.length()];
        for (int i = 0; i < charSet.length(); i++) {
            pwChar[i] = charSet.charAt(i);
        }

        // 랜덤 생성
        for (int i = 0; i < pwLength; i++) {
            madePw = pw.append(pwChar[random.nextInt(charSet.length())]);
        }
        System.out.println("생성된 비밀번호 : " + madePw);
    }

}
