package ch29_io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOStream01_Output {
    // 입출력 스트림
    public static void main(String[] args) {
        try {
            // "test1.txt" 를 도착지로 하는 바이트 출력 스트림을 생성
            OutputStream outputStream = new FileOutputStream("src/ch29_io_stream/files/test1.txt");

            byte b1 = 65;
            byte b2 = 66;
            byte b3 = 67;

            // write : 1바이트씩 출력
            outputStream.write(b1);
            outputStream.write(b2);
            outputStream.write(b3);

            // write 메소드가 호출되면, 버퍼에 바이트를 먼저 저장
            // 버퍼가 차면 순서대로 바이트를 출력

            // flush : 내부 버퍼에 잔류하는 바이트들을 비움
            outputStream.flush();

            // close : 스트림을 닫아서 메모리 해제
            outputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
