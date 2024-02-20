package ch01_variable;
//#2-18 시스템 입력장치 - 입력받은 그대로 출력(2024-02-07)

import java.util.Scanner;

public class Read2 {
    public static void main(String[] args) {
        // 키보드에 입력된 내용을 문자열로 얻기
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        // 받은 내용 문자열로 출력
        System.out.println(line);
    }
}
