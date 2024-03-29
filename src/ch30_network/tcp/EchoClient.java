package ch30_network.tcp;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    // Socket : 서버가 리스닝하고 있는 호스트와 포트를 알아야 함.
    public static void main(String[] args) {
        // 클라이언트 측에서 사용하는 단말
            // -> 호스트 이름과 포트 번호를 인자로 받음
        String hostName = "localhost";      // 서버의 호스트 이름 ( 자기자신 장치를 가리킴)
        int portNumber = 12345;            // 서버측 애플리케이션의 포트번호

        try {
            Socket socket = new Socket(hostName, portNumber);

            System.out.println("클라이언트가 서버에 연결이 되었습니다.");

            // 클라이언트 소켓의 입출력 스트림
            InputStream is = socket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(is));

            OutputStream os = socket.getOutputStream();
            PrintWriter out = new PrintWriter(new OutputStreamWriter(os), true);

            // 콘솔에서 표준 입력을 받는 입력스트림 리더
            // BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            // String input = stdIn.readLine();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                String input = scanner.nextLine();

                // 서버 쪽 출력스트림으로 메시지를 전송
                out.println(input);

                // 종료 조건
                if (input == null) break;

                String serverResponse = in.readLine();
                System.out.println("서버로부터 받은 입력: " + serverResponse);

            }

            // 리소스 정리
            os.flush();
            out.flush();

            is.close();
            in.close();
            os.close();
            out.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
