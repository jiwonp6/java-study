package ch30_network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    // 필드
    private static final int PORT = 12345;

    // 채팅에 접속한 클라이언트 리스트
    private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        // 특정 포트에서 클라이언트 연결 기다림
        try (ServerSocket serverSocket = new ServerSocket(PORT)){
            System.out.printf("채팅 서버가 %s 포트에서 실행 중입니다. \n", PORT);

            // 무한 루프로 대기하면서 클라이언트가 접속할 때마다
                // -> 클라이언트 소켓 생성 & 스레드 시작 + 대기
            while (true) {
                Socket clientSocket = serverSocket.accept();

                // 클라이언트 별로 스레드를 시작
                    // [순서]: 핸들러 생성 -> 리스트에 추가 -> 스레드 시작
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                clientHandler.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 클라이언트의 접속에 관련된 것 다루는 내부 클래스
    static class ClientHandler extends Thread {
        // 필드
        private Socket socket;      // 클라이언트 연결 소캣
        private PrintWriter out;    // 출력 스트림
        private BufferedReader in;  // 입력 스트림
        private String name;        // 클라이언트 대화명

        // 생성 시, 서버 소켓으로부터 소켓 정보를 받는다.
        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 스레드가 시작되면 입출력 스트림 할당
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                // 대화명 입력
                out.println("대화명을 입력해주세요 : ");    // 클라이언트에게 출력
                name = in.readLine();                   // 클라이언트에게 대화면 입력 받음

                // 필드
                String hostAddress = socket.getInetAddress().getHostAddress();
                String welcomeMessage = name + ": " + hostAddress + "님이 입장하셨습니다.";

                System.out.println(welcomeMessage);       // 콘솔 출력
                // out.println(welcomeMessage);              // 서버쪽 출력 (접속자가 한 명일 때 혼자 사용)

                for (ClientHandler client : clients) {     // 모든 클라이언트에게 표시
                    client.out.println(welcomeMessage);
                }

                // 클라이언트로부터 메시지를 받아서 출력
                while (true) {
                    String fromUser = in.readLine();
                    if (fromUser == null) break;
                    String chatMessage = String.format("[%s: %s]: %s", name, hostAddress, fromUser);

                    // 자기 서버에 보내는 것
                    System.out.println(chatMessage);

                    // 클라이언트에 보내는 것 (접속자가 한 명일 때 혼자 사용)
                    // out.println(chatMessage);

                    // 접속한 모두에게 메시지를 전송
                    for (ClientHandler client : clients) {
                        client.out.println(chatMessage);
                    }
                }

            } catch (IOException e) {
                System.out.println("예외가 발생했습니다." + e.getMessage());
            } finally {
                // 채팅을 종료한 클라이언트 -> 리스트에서 제거
                clients.remove(this);

                String exitMessage = String.format("%s님이 나가셨습니다.", name);

                // 모두에게 알리기
                System.out.println(exitMessage);
                for (ClientHandler client : clients) {
                    client.out.println(exitMessage);
                }
            }
        }
    }
}
