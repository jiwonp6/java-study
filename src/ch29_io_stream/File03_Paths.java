package ch29_io_stream;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File03_Paths {
    // java.ino 패키지
        // : 기존 java.io 패키지보다 다양한 기능을 제공 (7버전 이후 도입)
    // Paths 클래스
        // : 파일 시슽넴 경로를 인스턴스화 한 Path 객체를 생성, 경로 관련 메소드 제공

    public static void main(String[] args) {
        // ◎ Path
        // get : 폴더 경로 => 기본 상대경로
        Path path = Paths.get("");
        System.out.println("path = " + path);

        // toFile : nio -> io 호환 가능 (Path -> File)
        File file = path.toFile();
        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // absolutePath : 절대경로로 변경
        Path absolutePath = path.toAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);

        // get("인자", "인자", ...) : 여러 문자열을 결합하여 Path 경로 생성
            // 인자로 들어온 문자열 마다, 내부 폴더로 들어가는 Path 객체
        Path path1 = Paths.get("src", "ch29_io_stream", "files");
        System.out.println("path1 = " + path1);

        Path absolutePath1 = path1.toAbsolutePath();
        System.out.println("absolutePath1 = " + absolutePath1);


        // resolve : 두 경로 통합 (path3 = path1 + path2 | path5 = path3 + path4)
        Path path2 = Paths.get("sub", "deep", "more_deep");
        System.out.println("path2 = " + path2);

        Path path3 = path1.resolve(path2);
        System.out.println("path3 = " + path3);

        Path path4 = Paths.get("test.txt");
        System.out.println("path4 = " + path4);

        Path path5 = path3.resolve(path4);
        System.out.println("path5 = " + path5);

        // getParent : 상위 경로
        Path path6 = path1.getParent();         // path1 = src\ch29_io_stream\files
        System.out.println("path6 = " + path6); // path6 = src\ch29_io_stream

        // 끝단 파일 이름
        Path fileName5 = path5.getFileName();
        System.out.println("fileName5 = " + fileName5);

    }
}
