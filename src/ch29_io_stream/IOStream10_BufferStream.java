package ch29_io_stream;

import java.io.*;

public class IOStream10_BufferStream {
    // 문자열 버퍼 스트림
    // 내부적으로 성능 향상 + 줄 단위의 편리한 메소드 제공
    public static void main(String[] args) throws IOException {
        String sourcePath = "src/ch29_io_stream/files/lineText.txt";
        try {
            // 1. BufferedWriter
            BufferedWriter bw = new BufferedWriter(new FileWriter(sourcePath));

            // newLine 메소드 제공
            bw.write("안녕하세요.");
            bw.newLine();   // 줄 구분
            bw.write("반갑습니다.");

            bw.close();

            // 2. BufferedWriter
            BufferedReader br = new BufferedReader(new FileReader(sourcePath));

            // readLine 메소드 제공
            while (true) {
                String line = br.readLine();    // 파일에서 한 줄씩 읽음
                if (line == null) break;
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
