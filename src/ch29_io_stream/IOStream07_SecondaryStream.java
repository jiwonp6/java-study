package ch29_io_stream;

import java.io.*;

public class IOStream07_SecondaryStream {
    // 보조 스트림
        // : 다른 스트림과 연결되어 다양한 기능을 추가하는 스트림
    // 단독으로 사용 X -> 기반 스트림이나, 다른 보조 스트림에 연결해서 사용

    // 문자 변환 스트림
    public static void main(String[] args) {
        try {
            // 기반 스트림 : 파일 출력 스트림
            OutputStream outputStream = new FileOutputStream("src/ch29_io_stream/files/test4.txt");

            // 보조 스트림 : 문자열 변환 스트림, 매개변수로 기반 스트림을 받음
                // 두 번째 매개변수로 Charset 을 받을 수 있음
            Writer writer = new OutputStreamWriter(outputStream, "EUC-KR");

            writer.write("보조 스트림");

            writer.flush();

            writer.close();

            // 입력 스트림(바이트 기반) : 읽기
            InputStream inputStream = new FileInputStream("src/ch29_io_stream/files/test4.txt");

            // 보조 스트림 : 문자열 변환 스트림
                // 두 번째 매개변수로 읽는 소스와 동일한 인코딩을 지정 "UTF-8" (기본), "EUC-KR", etc ...
            Reader reader = new InputStreamReader(inputStream, "EUC-KR");

            char[] buffer = new char[1024];
            int length = reader.read(buffer);

            reader.close();

            // 버퍼에서 읽은 길이만큼 문자열을 출력
            System.out.println(new String(buffer, 0, length));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
