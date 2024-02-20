package ch01_variable;
//#2-17 시스템 입력장치 - 아스키코드(2024-02-07)

import java.io.IOException;

public class Read1 {
    public static void main(String[] args) throws IOException {
        // 시스템 입력장치에서 키 읽기
        int read = System.in.read();    // 시스템 입력장치에서 키를 읽어라
        // 읽은 결과는 Key Code로 저장됨.
        System.out.println(read);       // ex. 0 -> 48, a -> 97

    }
}
