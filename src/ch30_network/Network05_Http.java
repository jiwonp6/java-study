package ch30_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class Network05_Http {
    public static void main(String[] args) {
        String urlString = "http://example.com";

        try {
            URL url = new URL(urlString);

            // HttpURLConnection: URL 객체에서 HTTP 연결 객체를 생성
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // setRequestProperty: 연결되기 전 헤더 정보 변경
            connection.setRequestProperty("User-Agent", "UserModified/1.0");

            // getRequestMethod, setRequestMethod: HTTP 요청 메소드 가져오기, 설정하기
            String requestMethod = connection.getRequestMethod();
            connection.setRequestMethod("GET");     // 기본 값이 GET, Post 등으로 변경 가능
            System.out.println("requestMethod = " + requestMethod);

            // getHeaderFields: 헤더 정보 가져오기
            Map<String, List<String>> headerFields = connection.getHeaderFields();
            System.out.println("headerFields = " + headerFields);

            // getResponseCode: Status Code 가져오기
            int responseCode = connection.getResponseCode();
            System.out.println("responseCode = " + responseCode);

            // getResponseMessage: 응답 메시지 가져오기
            String responseMessage = connection.getResponseMessage();
            System.out.println("responseMessage = " + responseMessage);

            // 응답을 받을 객체
            StringBuilder stringBuilder = new StringBuilder();      // response

            // getResponseCode : 정상적인 응답 (200, OK) 인 경우
            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));


                while (true) {
                    String line = br.readLine();
                    if (line == null) break;
                    System.out.println("line = " + line);
                    stringBuilder.append(line + "\n");

                }
                br.close();
            }
            System.out.println(stringBuilder);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
