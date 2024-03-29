package ch30_network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Network02_URI {
    public static void main(String[] args) {
        try {
            // 문자열로부터 URI 객체 생성
            URI uri = new URI("https://blog.naver.com/applyzz99/223397997588");

            // URI 의 메타정보
            String scheme = uri.getScheme();
            System.out.println("scheme = " + scheme);

            String host = uri.getHost();
            System.out.println("host = " + host);

            String path = uri.getPath();
            System.out.println("path = " + path);

            String query = uri.getQuery();
            System.out.println("query = " + query);

            String fragment = uri.getFragment();
            System.out.println("fragment = " + fragment);

            int port = uri.getPort();
            System.out.println("port = " + port);

            // toString : URI 를 문자열 객체로 반환
            String uriString = uri.toString();
            System.out.println("uriString = " + uriString);

            // toURL : URI 를 URL 객체로 반환
            URL url = uri.toURL();
            System.out.println("url = " + url);

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
