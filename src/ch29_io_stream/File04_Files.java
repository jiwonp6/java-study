package ch29_io_stream;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class File04_Files {
    // java.ino 패키지
        // : 기존 java.io 패키지보다 다양한 기능을 제공 (7버전 이후 도입)
    // Files 클래스
        // : 파일과 디렉토리에 대한 정적 메소드

    public static void main(String[] args) {
        // ◎ Files
        Path currentPath = Paths.get("src", "ch29_io_stream", "files");;   // src\ch29_io_stream\files
        Path newFilePath = currentPath.resolve("test.txt");

        // createFile : 파일생성
        try {
            Files.createFile(newFilePath);
        } catch (FileAlreadyExistsException e) {
            // 파일이 존재할 경우 덮어쓰기 하는 대신 예외 발생
            System.out.println("파일이 이미 존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // copy : 파일 복사
        Path targetPath = currentPath.resolve("copyFile.txt");
        try {
            Files.copy(newFilePath, targetPath);
            System.out.println("파일을 성공적으로 복사했습니다.");
        } catch (FileAlreadyExistsException e) {
            // 파일이 존재할 경우 덮어쓰기 하는 대신 예외 발생
            System.out.println("파일이 이미 존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // deleteIfExists : 파일 삭제
        try {
            Files.deleteIfExists(newFilePath);
            System.out.println("파일을 성공적으로 삭제했습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // createDirectories : 디렉토리 생성 (중간 경로가 없으면 함께 생성, 중첩된 폴더 생성)
        try {
            Files.createDirectories(currentPath.resolve(Paths.get("new", "sub", "deep")));
            System.out.println("디렉토리가 성공적으로 생성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // move : 파일이동
        try {
            Files.move(targetPath, currentPath.resolve(Paths.get("new", "copyFile1.txt")));
            System.out.println("파일이 성공적으로 이동되었습니다.");
        } catch (FileAlreadyExistsException e) {
            // 파일이 존재할 경우 덮어쓰기 하는 대신 예외 발생
            System.out.println("파일이 이미 존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // write : Files 이용해서 파일 쓰기
        try {
            Files.write(targetPath, "안녕하세요".getBytes());
            System.out.println("파일이 성공적으로 작성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 여러줄 쓰기
        List<String> stringList = Arrays.asList("안녕하세요.", "반갑습니다.", "여러 줄 텍스트입니다.", "문자열이 나누어져 들어가 있습니다.");
        try {
            Files.write(targetPath, stringList);
            System.out.println("파일이 List를 이용해 성공적으로 작성되었습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // lines : 파일에서 문자열을 줄별로 읽어 Stream API 로 활용
        try {
            Stream<String> lines = Files.lines(targetPath);
            lines.map(s -> "> " + s)
                 .limit(2)
                 .forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // walk : 시작 경로로부터 깊이 우선 탐색 (DFS) 방식으로 Path 의 스트림을 반환
        // 시작 경로로부터 모든 하위 파일과, 디렉토리를 탐색할 때 사용
        try {
            Stream<Path> src = Files.walk(Paths.get("src"));
            src.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // readAttributes : 파일 관련 속성 읽기
        try {
            BasicFileAttributes attrs = Files.readAttributes(targetPath, BasicFileAttributes.class);

            System.out.println("파일 생성 시간: " + attrs.creationTime());
            System.out.println("마지막 접근 시간: " + attrs.lastAccessTime());
            System.out.println("파일 크기: " + attrs.size());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
