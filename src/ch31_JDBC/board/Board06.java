package ch31_JDBC.board;

import java.sql.*;
import java.util.Scanner;

public class Board06 {
    // 콘솔 게시판 앱 메뉴
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public Board06() {
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
        String subMenuNo = scanner.nextLine();

        if (subMenuNo.equals("1")) {
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
        System.out.println("[게시물 읽기]");
        scanner.nextLine(); // buffer
        System.out.println("게시글 번호: ");
        int boardNo = Integer.parseInt(scanner.nextLine());
        String sql = "SELECT boardNo, title, content, writer, date, filename, filedata FROM boards WHERE boardNo = ?";

        try (
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setInt(1, boardNo);
            ResultSet rs = pstmt.executeQuery();

            // 결과 처리
            if (rs.next()) {
                Board board = new Board(rs.getInt("boardNo"),
                                        rs.getString("title"),
                                        rs.getString("content"),
                                        rs.getString("writer"),
                                        rs.getDate("date"));

                System.out.println("-------------------------------------------");
                System.out.println("글번호: " + board.getBoardNo());
                System.out.println("글제목: " + board.getTitle());
                System.out.println("글내용: " + board.getContent());
                System.out.println("작성자: " + board.getWriter());
                System.out.println("작성날짜: " + board.getDate());
                System.out.println("-------------------------------------------");

                // 보조 메뉴
                System.out.println("-------------------------------------------");
                System.out.println("보조메뉴: 1. Update | 2. Delete | 3. List");
                System.out.println("-------------------------------------------");
                System.out.println("메뉴선택: ");
                String subMemuNo = scanner.nextLine();
                
                // 상세글에서 수정, 삭제
                if (subMemuNo.equals("1")) {
                    update(board);
                } else if (subMemuNo.equals("2")) {
                    delete(board);
                }

            }
            rs.close();
        } catch (SQLException e) {
          e.printStackTrace();
          exit();
        }
        list();
    }

    private void update(Board board) {
        // 수정 내용 입력받기
        System.out.println("[수정할 내용 입력]");
        System.out.println("제목: ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) {
            board.setTitle(title);
        }
        System.out.println("내용: ");
        String content = scanner.nextLine();
        if (!content.isEmpty()) {
            board.setContent(content);
        }
        System.out.println("작성자: ");
        String writer = scanner.nextLine();
        if (!writer.isEmpty()) {
            board.setWriter(writer);
        }
        
        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("보조메뉴: 1. Ok, 2. Cancel");
        System.out.println("-------------------------------------------");
        System.out.println("메뉴선택: ");
        String subMenuNo = scanner.nextLine();

        // 게시글 수정
        if (subMenuNo.equals("1")) {
            String sql = "UPDATE boards SET title = ?, content = ?, writer = ? WHERE boardNo = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                pstmt.setString(1, board.getTitle());
                pstmt.setString(2, board.getContent());
                pstmt.setString(3, board.getWriter());
                pstmt.setInt(4, board.getBoardNo());

                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }

    private void delete(Board board) {
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
        Board06 board = new Board06();
        board.list();
        board.mainMenu();
    }
}
