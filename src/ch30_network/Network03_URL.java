package ch30_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Network03_URL {
    public static void main(String[] args) {
        try {
            // 문자열로부터 URL 객체 생성
                // URI 의 구조처럼 가지고 올 수 있음
            URL url = new URL("https://blog.naver.com/applyzz99/223397997588");

            // 형식에 맞지 않는 문자열을 사용할 경우 : MalformedURLException 예외 발생

            // toExternalForm
            String externalForm = url.toExternalForm();
            System.out.println("externalForm = " + externalForm);

            // getProtocol
            String protocol = url.getProtocol();
            System.out.println("protocol = " + protocol);

            // getPort
            int port = url.getPort();
            System.out.println("port = " + port);               // 없으면 -1

            // getDefaultPort
            int defaultPort = url.getDefaultPort();
            System.out.println("defaultPort = " + defaultPort); // 없으면 기본 포트 반환

            // getFile
            String file = url.getFile();
            System.out.println("file = " + file);               // path + query 반환

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
