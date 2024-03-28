package ch29_io_stream.ex_file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ex4 {
    /*
        <자바 프로젝트 코드 분석>
        [문제 요구사항]
        현재 Java 프로젝트의 src 디렉토리 내에 있는 모든 자바 파일(.java)에 대한 코드 분석을 수행하는 프로그램을 작성하세요.
        분석 결과로 다음 정보를 출력해야 합니다

        [요구사항]
        - src 디렉토리 내에 있는 총 자바 파일(.java)의 개수
        - 모든 자바 파일의 총 코드 라인 수
        - 실습문제(파일이름이 "EX")로 시작하는 파일의 수

        [출력 예시]
        자바 프로젝트 코드 분석 결과
        - 총 자바 파일 개수: xxx개
        - 총 코드 라인 수: xxxxx줄
        - 실습문제 풀이 수 : xxx개
     */
    public static void main(String[] args) {
        // 필드
        Path srcPath = Paths.get("src");
        long fileCount = 0;
        long fileCodeCount = 0;
        long exCount = 0;

        try {
            Stream<Path> srcFiles1 = Files.walk(srcPath);
            Stream<Path> srcFiles2 = Files.walk(srcPath);
            Stream<Path> srcFiles3 = Files.walk(srcPath);

            // 총 자바 파일 개수 구하기
            fileCount = srcFiles1.filter(path -> path.toString().endsWith(".java"))
                              .count();
            System.out.println("- 총 자바 파일 개수: " + fileCount + "개");

            // 총 코드 라인 수 구하기
            fileCodeCount = srcFiles2.filter(path -> path.toString().endsWith(".java"))
                                    .mapToLong(path -> {
                                        try {
                                            return Files.lines(path).count();
                                        } catch (IOException e) {
                                            System.out.println("파일 읽기 예외");
                                        }
                                        return 0;
                                    }).sum();
            System.out.println("- 총 코드 라인 수: " + fileCodeCount + "줄");

            // 실습문제 풀이 수 구하기
            exCount = srcFiles3.filter(path -> path.getFileName().toString().startsWith("Ex"))
                                .count();
            System.out.println("- 실습문제 풀이 수 : " + exCount + "개");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
