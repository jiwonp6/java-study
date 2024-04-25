package ch31_JDBC.board;

import java.sql.*;
import java.util.Date;
import java.util.Scanner;

public class Board04 {
    // 콘솔 게시판 앱 메뉴
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public Board04() {
        // 접속 정보 (jdbc 스키마)
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String pw = "1234";

        try {
            conn = DriverManager.getConnection(url, user, pw);
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
    }

    public  void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");

        String sql = "SELECT boardNo, title, content, writer, date FROM boards ORDER BY boardNo DESC";
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                Board board = new Board(rs.getInt("boardNo"),
                                        rs.getString("title"),
                                        rs.getString("content"),
                                        rs.getString("writer"),
                                        rs.getDate("date"));
                System.out.printf("%-6s%-12s%-16s%-40s\n", board.getBoardNo(), board.getWriter(), board.getDate(), board.getTitle());
            }
        } catch (SQLException e) {
            e.printStackTrace();
            exit();
        }
        mainMenu();
    }

    public void mainMenu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.println("메뉴선택: ");
        int menuNo = scanner.nextInt();
        switch (menuNo) {
            case 1:
                create();
                break;
            case 2:
                read();
                break;
            case 3:
                clear();
                break;
            case 4:
                exit();
                break;

        }
    }
    private void create() {
        // 게시글 입력받아 객체 생성
        System.out.println("[새 게시물 생성]");
        scanner.nextLine(); // buffer
        System.out.println("제목: ");
        String title = scanner.nextLine();
        System.out.println("내용: ");
        String content = scanner.nextLine();
        System.out.println("작성자: ");
        String writer = scanner.nextLine();

        Board board = new Board(title, content, writer);
        
        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("보조메뉴: 1. Ok, 2. Cancel");
        System.out.println("-------------------------------------------");
        System.out.println("메뉴선택: ");
        int subMenuNo = scanner.nextInt();

        if (subMenuNo == 1) {
            String sql = "INSERT INTO boards (title, content, writer) VALUES (?, ?, ?)";
            // 객체에서 핑드를 가져와 동적 sql 문 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());

                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }

        list();
    }
    private void read() {
        System.out.println("board02.read");
        list();
    }

    private void clear() {
        System.out.println("board02.clear");
        list();
    }
    private void exit() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Board04 board = new Board04();
        board.list();
        board.mainMenu();
    }
}
