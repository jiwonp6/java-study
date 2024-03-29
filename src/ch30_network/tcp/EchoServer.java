package ch30_network.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {
        try {
            // 서버 측에서 사용되는 ServerSocket 클래스
                // -> 포트 번호를 인자로 받음
            // accept : 클라이언트의 요청을 기다리고, 요청이 들어오면 해당 클라이언트와 통신을 하는 Socket 객체를 반환
            int portNumber = 12345;
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("서버를 시작하고 클라이언트의 연결을 기다립니다.");

            Socket clientSocket = serverSocket.accept();        // socket 생성
            System.out.println("클라이언트의 연결을 받았습니다.");

            // 클라이언트 소켓에서 InputStream, OutputStream 을 받음
            OutputStream os = clientSocket.getOutputStream();
            PrintWriter out = new PrintWriter(os, true);

            InputStream is = clientSocket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));

            while (true) {
                // 클라이언트로부터 입력 받음
                String line = in.readLine();

                // 종료 조건
                if (line == null) break;

                // 콘솔 출력
                System.out.println("서버가 클라이언트에서 받은 메세지: " + line);

                // 클라이언트에서 받은 메세지를 다시 클라이언트로 되돌려 보낸다.
                out.println(line);
            }

            // 리소스 정리
            out.flush();
            os.flush();

            in.close();
            is.close();
            out.close();
            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
