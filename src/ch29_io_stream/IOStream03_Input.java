package ch29_io_stream;

import java.io.*;

public class IOStream03_Input {
    // 입출력 스트림
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/ch29_io_stream/files/test2.txt");

            // 1바이트씩 읽음
            int read1 = inputStream.read();
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            int read4 = inputStream.read();
            int read5 = inputStream.read();
            int read6 = inputStream.read();

            System.out.println("read1 = " + read1);
            System.out.println("read2 = " + read2);
            System.out.println("read3 = " + read3);
            System.out.println("read4 = " + read4);
            System.out.println("read5 = " + read5);
            // 더이상 읽을 바이트가 없으면 -1을 반환
            System.out.println("read6 = " + read6);

            inputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
