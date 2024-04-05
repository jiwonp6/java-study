package quiz.quiz7.q5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Quiz05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("디렉토리 경로를 입력하세요.");
        String directoryPath = scanner.nextLine();

        Path path = Paths.get(directoryPath);

        try {
            Stream<Path> search = Files.walk(path);
            long sum = search.filter(p -> p.toFile().isFile()).mapToLong(p -> {
                try {
                    return Files.size(p);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).sum();
            System.out.println(directoryPath + " 디렉토리 내 모든 파일 크기의 합: " + sum + " Byte");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
