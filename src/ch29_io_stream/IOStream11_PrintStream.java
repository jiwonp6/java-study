package ch29_io_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class IOStream11_PrintStream {
    // 프린트 스트림: 데이터를 텍스트 형태로 출력 할 때 사용되는 스트림
    // System.out 객체가 대표적인 예시
    // 텍스트 갑을 출력하고, 자동으로 flush (버퍼를 비움)
    public static void main(String[] args) {
        String filePath = "src/ch29_io_stream/files/test5_print.txt";
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            PrintStream printStream = new PrintStream(fos);

            printStream.print("프린트 스트림은 ");
            printStream.print("마치 프린터에서 출력하는 것처럼 ");
            printStream.println("데이터를 출력합니다.");
            printStream.printf("| %10d | %-10s | %10s | \n", 1, "홍길동", "학생");
            printStream.printf("| %10d | %-10s | %10s | \n", 2, "임꺽정", "선생");
            printStream.printf("| %10d | %-10s | %10s | \n", 3, "이몽룡", "학생");

            printStream.close();
            fos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // System.out 의 클래스는 PrintStream 임.
        System.out.println(System.out.getClass());

        // 시스템 출력의 대상을 변경
        System.setOut(System.out);
        System.out.println("콘솔에 출력");

        try {
            PrintStream ps = new PrintStream(new FileOutputStream("src/ch29_io_stream/files/test6_print2.txt"));

            // 시스템 출력의 대상을 변경
            System.setOut(ps);
            System.out.println("파일에 출력");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
