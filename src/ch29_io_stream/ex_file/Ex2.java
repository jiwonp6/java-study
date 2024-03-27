package ch29_io_stream.ex_file;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex2 {
    /*
        <텍스트 파일 병합 도구>
        여러 개의 텍스트 파일을 입력받아, 그 내용을 모두 병합하여 새로운 파일에 저장하는 프로그램을 작성하세요.

        [요구사항]
        - 사용자로부터 병합할 텍스트 파일 경로들을 입력받습니다.
        - 모든 파일의 내용을 순서대로 읽어, "merged.txt"라는 새 파일에 병합하여 저장합니다.
        - 각 파일 내용의 구분을 위해 파일 병합 시 각 파일 내용 사이에 구분선(예: "-----")을 삽입합니다.

        [실행예시]
        병합할 파일의 개수를 입력하세요:
        2
        파일 경로를 입력하세요:
        frog.txt
        파일 경로를 입력하세요:
        bear.txt
        파일 병합 완료.

        [파일예시]
        frog.txt
        개굴개굴 개구리 노래를 한다
        아들 손자며느리 다 모여서
        밤새도록 하여도 듣는 이 없네
        듣는 사람 없어도 날이 밝도록
        개굴개굴 개구리 노래를 한다
        개굴개굴 개구리 목청도 좋다

        bear.txt
        곰 세 마리가 한 집에 있어
        아빠 곰 엄마 곰 애기 곰
        아빠 곰은 뚱뚱해
        엄마 곰은 날씬해
        애기 곰은 너무 귀여워
        으쓱 으쓱 잘한다

        merge.txt
        개굴개굴 개구리 노래를 한다
        아들 손자며느리 다 모여서
        밤새도록 하여도 듣는 이 없네
        듣는 사람 없어도 날이 밝도록
        개굴개굴 개구리 노래를 한다
        개굴개굴 개구리 목청도 좋다
        -----
        곰 세 마리가 한 집에 있어
        아빠 곰 엄마 곰 애기 곰
        아빠 곰은 뚱뚱해
        엄마 곰은 날씬해
        애기 곰은 너무 귀여워
        으쓱 으쓱 잘한다
        -----
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("병합할 파일의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int num = 0;
        Path filePath = Paths.get("src/ch29_io_stream/ex_file/ex2_files");
        try {
            // 병합할 파일 생성
            Path mergeFilePath = Files.createFile(filePath.resolve("merge"+num+".txt"));
            for (int i = 0; i < count; i++) {
                System.out.println("파일 경로를 입력하세요:");
                String fileName = scanner.nextLine();
                Path searchFilePath = Paths.get(String.valueOf(filePath), fileName);

                Stream<String> lines = Files.lines(searchFilePath);
                Files.write(mergeFilePath, lines.toList());
                //Files.write(mergeFilePath, "------".getBytes());
                num++;
            }
        } catch (FileAlreadyExistsException e) {
            System.out.println("파일이 이미존재합니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
