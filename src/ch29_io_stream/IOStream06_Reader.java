package ch29_io_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOStream06_Reader {
    // Reader : 문자열 입력 스트림
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("src/ch29_io_stream/files/test3.txt");

            while (true) {
                // 한 문자씩 읽기
                int readCharacter = reader.read();
                if (readCharacter == -1) break;
                // => 아스키코드(int)로 반환
                System.out.print(readCharacter);
                // => 캐스팅을 통해 문자로 반환
                System.out.print(": " + (char) readCharacter + "\t");
            }

            reader.close();

            System.out.println();
            // 문자 배열을 사용하여 읽기
            reader = new FileReader("src/ch29_io_stream/files/test3.txt");    // 시작 전 새로 초기화
            char[] buffer = new char[1024];
            while (true) {
                // 읽은 문자를 버퍼 배열에 저장하고, 문자 수만큼 반환
                int length = reader.read(buffer);
                // 문자 끝(-1) -> 종료
                if (length == -1) break;
                // 출력
                for (int i = 0; i < length; i++) {
                    System.out.print(buffer[i] + "\t");
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
