package ch30_network.ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex2 {
    /*
        <웹 페이지 제목 추출기>
        주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
        이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

        - 웹 페이지의 HTML 내용을 가져옵니다.
        - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
        - 추출한 텍스트를 출력합니다.

        - 입력 예시: https://www.example.com
        - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */
    public static void main(String[] args) {
        try {
            // 필드
            URL url = new URL("https://blog.naver.com/applyzz99");
            boolean soutTrue = false;

            // URL 과 InputStream 의 연결 객체 반환
            URLConnection connection = url.openConnection();

            // Input
            InputStream inputStream = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);

            // Output
            FileWriter writer = new FileWriter("src/ch30_network/ex/pageTitle.html");
            BufferedWriter bw = new BufferedWriter(writer);


            while (true) {
                String line = br.readLine();

                // 종료 조건
                if (line == null) break;

                // <title> : 시작
                if (line.contains("<title>")) {
                    soutTrue = true;
                }

                // <title> 내부면 출력
                if (soutTrue) {
                    String insideContent = line.split("<title>")[1].split("</title>")[0];
                    System.out.println(insideContent);
                    bw.write(insideContent);
                    bw.newLine();
                }

                // </title> : 종료
                if (line.contains("</title>")) {
                    soutTrue = false;
                }
            }

            // 닫기
            br.close();
            isr.close();
            inputStream.close();

            bw.close();

        } catch (MalformedURLException e) {

            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
