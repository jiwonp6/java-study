package ch29_io_stream.ex_io_stream;

import java.io.*;

public class Ex2 {
    /*
        <로그 파일 분석기>

        [문제 설명]
        로그 파일을 분석하는 자바 프로그램을 작성해야 합니다.
        이 프로그램은 로그 파일에서 "에러(ERROR)"가 발생한 모든 라인을 찾아 그 내용을 별도의 파일("errorLogs.txt")에 저장해야 합니다.
        로그 파일의 경로는 프로그램 실행 시 사용자로부터 입력받으며,
        분석 완료 후 사용자에게 "분석 완료" 메시지와 함께 에러 로그의 총 개수를 출력해야 합니다.

        [요구 사항]
        - 로그 파일 경로 분석
            : 로그 파일은 server.log 에 저장되어 있습니다.
        - 에러 로그 분석
            : 로그 파일을 읽고, "ERROR"라는 단어가 포함된 모든 라인을 찾습니다.
        - 결과 저장
            : 찾은 에러 로그를 "errorLogs.txt" 파일에 저장합니다.
              각 - 에러 로그는 파일의 새로운 줄에 기록되어야 합니다.
        - 분석 결과 출력
            : 에러 로그의 총 개수와 함께 사용자에게 분석이 완료되었음을 알립니다.

        [실행예시]
        분석 완료. 총 5개의 에러 로그를 찾았습니다.

        errorLogs.txt
            2021-01-01 11:50:00 ERROR 데이터베이스 연결 실패
            2021-01-01 11:55:00 ERROR 이메일 서비스 불응
            2021-01-01 12:00:00 ERROR 사용자 인증 실패: user456
            2021-01-01 12:10:00 ERROR 파일 업로드 실패: /path/to/file.jpg
            2021-01-01 12:20:00 ERROR 보안 위반 시도 감지
     */
    public static void main(String[] args) {
        try {
            int errorCount = 0;
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ch29_io_stream/files/errorLogs.log"));
            BufferedReader br = new BufferedReader(new FileReader("src/ch29_io_stream/files/server.log"));

            while (true) {
                String line = br.readLine();    // 파일에서 한 줄씩 읽음
                if (line == null) break;        // 종료 조건
                if (line.contains("ERROR")) {
                    errorCount++;
                    bw.write(line);
                    bw.newLine();
                }
            }
            System.out.printf("분석 완료. 총 %d 개의 에러 로그를 찾았습니다.", errorCount);

            bw.close();
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
