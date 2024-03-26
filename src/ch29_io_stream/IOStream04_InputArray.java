package ch29_io_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class IOStream04_InputArray {
    // 입출력 스트림
    public static void main(String[] args) {
        // 바이트 배열로 읽기
        try {
            InputStream inputStream = new FileInputStream("src/ch29_io_stream/files/test2.txt");

            // 최대 1024 바이트를 저장하는 바이트 배열
            byte[] buffer = new byte[1024];

            while (true) {
                // 최대 1024 바이트를 읽고, 매개변수 buffer (바이트 배열)에 읽은 바이트를 저장
                int number = inputStream.read(buffer);
                // 파일 끝(-1) -> 종료
                if (number == -1 ) break;

                // 읽은 바이트를 출력
                for (int i = 0; i < number; i++) {      // number = 5
                    System.out.println(buffer[i]);
                }
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
