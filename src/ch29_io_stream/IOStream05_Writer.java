package ch29_io_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOStream05_Writer {
    // Writer : 문자열 출력 스트림
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("src/ch29_io_stream/files/test3.txt");

            // Character 1개씩 출력
            writer.write('a');
            writer.write('b');
            writer.write('c');

            // Character 배열을 출력
            char[] chars = {'d', 'e', 'f'};
            writer.write(chars);

            // 문자열을 출력
            writer.write("ghijk");

            // 버퍼에 남아있는 문자를 출력하고 비움.
            writer.flush();

            // 출력 스트림 닫기
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
