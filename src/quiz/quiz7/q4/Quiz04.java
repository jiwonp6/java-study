package quiz.quiz7.q4;

import java.io.*;
import java.util.Scanner;

public class Quiz04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (OutputStream os = new FileOutputStream("src/quiz/quiz7/q4/output.txt");
             BufferedOutputStream bos = new BufferedOutputStream(os);
             Writer writer = new OutputStreamWriter(bos)) {
            while (true) {
                System.out.println("문자열을 입력하세요.");
                String line = scanner.nextLine();

                if (line.equals("종료")) break;

                writer.write(line + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
