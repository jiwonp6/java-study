package ch29_io_stream.ex_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex3 {
    /*
        <디렉토리 크기 계산>
        지정된 디렉토리 내의 모든 파일 크기의 합을 계산하여 출력하는 프로그램을 작성하세요.
        하위 디렉토리의 파일 크기도 포함되어야 합니다.

        [요구사항]
        - 사용자로부터 디렉토리 경로를 입력받습니다.
        - 입력된 디렉토리 내의 모든 파일 크기의 합을 계산합니다.
        - 계산된 총 크기를 출력합니다.
        - 단위는 Byte로 표시하고, 1024Byte가 넘는 경우 단위를 변환하여 KB로 나타내주세요.
        (1KB = 1024Byte)

        - 힌트 : nio.Files의 walk를 사용하면 내부 디렉토리 및 파일을 모두 탐색할 수 있습니다.

        [출력예시]
        디렉토리 경로를 입력하세요: src
        총 크기: 147KB
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("디렉토리 경로를 입력하세요: ");
        String directory = scanner.nextLine();

        Path startPath = Paths.get(directory);
        long totalDirectoryFileSize = 0;

        try {
            Stream<Path> search = Files.walk(startPath);

            totalDirectoryFileSize = search
                    .filter(path -> path.toFile().isFile())   // 파일만 필터링
                    .mapToLong(path -> {                      // 해당 파일 사이즈 반환
                        try {
                            return Files.size(path);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    })
                    .sum();                                   // 합계

            if (totalDirectoryFileSize > 1024) {
                System.out.println("총 크기: " + (totalDirectoryFileSize / 1024) + "KB");
            } else {
                System.out.println("총 크기: " + totalDirectoryFileSize + "Byte");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
