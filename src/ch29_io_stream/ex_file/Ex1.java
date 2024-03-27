package ch29_io_stream.ex_file;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex1 {
    /*
        <사용자 정보 저장 및 조회 시스템>
        사용자로부터 이름, 이메일, 나이를 입력받아, 각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요.
        그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

        [요구사항]
        - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
        - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
        - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
        - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

        [실행예시]
        1: 정보 저장, 2: 정보 조회
        > 1
        이름: 홍길동
        이메일: abc@def.com
        나이: 30
        정보 저장 완료.

        1: 정보 저장, 2: 정보 조회
        > 2
        홍길동.user
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보저장, 2: 정보 조회");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("이메일 : ");
                String email = scanner.nextLine();
                System.out.print("나이 : ");
                int age = scanner.nextInt();

                User user = new User(name, email, age);

                Path filePath = Paths.get("src/ch29_io_stream/ex_file/ex1_userFiles").resolve(name + ".user");
                try {
                    // 파일 생성
                    Path newFilePath = Files.createFile(filePath);

                    // 파일 쓰기
                    Files.write(newFilePath, user.toString().getBytes());
                    System.out.println("파일이 성공적으로 작성되었습니다.");

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case 2:
                try {
                    Stream<Path> userFiles = Files.walk(Paths.get("src/ch29_io_stream/ex_file/ex1_userFiles"));

                    userFiles.
                            forEach(s -> System.out.println(s.getFileName()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                System.out.println("잘못 선택하셨습니다.");
        }
    }

    static class User implements Serializable{
        private String name;
        private String email;
        private int age;

        public User(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }

        @Override
        public String toString() {
            return "이름: " + name
                    + "\n이메일: " + email
                    + "\n나이: " + age;
        }
    }
}
