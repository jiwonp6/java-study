package ch29_io_stream.ex_file;

import java.io.*;
import java.util.Scanner;

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

        String currentPath = "src/ch29_io_stream/ex_file/ex1_userFiles/";

        // 정보저장
        switch (choice) {
            case 1:
                // 정보 받기
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("이메일 : ");
                String email = scanner.nextLine();
                System.out.print("나이 : ");
                int age = scanner.nextInt();

                // 객체
                User user = new User(name, email, age);

                // 유저 정보 파일 생성
                saveUser(currentPath, name, user);

                break;

            case 2:
                // 유저 리스트 출력
                printUserList(currentPath);

                break;

            default:
                System.out.println("잘못 선택하셨습니다.");
        }
    }


    // 메소드
    private static void saveUser(String currentPath, String name, User user) {
        // 파일 객체 생성
        File file = new File(currentPath + name + ".user");

        // 유저 정보 넣기 -> 파일 생성
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write(user.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printUserList(String currentPath) {
        // 파일 객체 생성 (파일의 경로를 이용하기 위해서)
        File currentDir = new File(currentPath);

        // 파일 객체 배열
        File[] files = currentDir.listFiles();

        // 배열 출력
        for (File f : files) {
            String fileName = f.getName();
            if (fileName.endsWith(".user")) {
                System.out.println(f.getName());
            }
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
