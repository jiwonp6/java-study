package ch30_network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Network04_ReaderAndWriter {
    public static void main(String[] args) {
        try {
            // URL 객체 연결
            URL naverURL = new URL("https://blog.naver.com");
            URL myBlogURL = new URL(naverURL, "/applyzz99");

            // URL 과 InputStream 의 연결 객체 반환
            URLConnection connection = myBlogURL.openConnection();

            // URL 연결 정보에서 입력 스트림으로 데이터를 받음
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            // 출력스트림으로
            FileWriter writer = new FileWriter("src/ch30_network/page.html");
            BufferedWriter bw = new BufferedWriter(writer);


            // 한 줄 씩 출력하기
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                System.out.println("line = " + line);

                // 입력스트림으로 받은 내용 쓰기
                bw.write(line);
                bw.newLine();
            }

            // 닫기
            br.close();
            isr.close();
            is.close();

            bw.close();

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
