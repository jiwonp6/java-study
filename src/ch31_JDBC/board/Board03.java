package ch31_JDBC.board;

import java.sql.*;
import java.util.Scanner;

public class Board03 {
    // 콘솔 게시판 앱 메뉴
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public Board03() {
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
        System.out.println("board02.create");
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
        Board03 board = new Board03();
        board.list();
        board.mainMenu();
    }
}
