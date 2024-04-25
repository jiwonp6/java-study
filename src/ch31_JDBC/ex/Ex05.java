package ch31_JDBC.ex;

import ch31_JDBC.board.Board;
import ch31_JDBC.board.Board08;

import java.sql.*;
import java.util.Scanner;

public class Ex05 {
    /*
        [연습문제]
        앞에서 구현한 게시판에서 다음 내용과 같이 새 사용자를 가입하기 기능을 추가해보세요.

        [실행내용]
        1. 메인 메뉴에 '4.]oin' 메뉴를 다음과 같이 추가한다.

        ```
        메인메뉴: 1.Create | 2.Read | 3.Clear | 4.Join | 5.Exit
        메뉴선택:
        ```

        2. '4.Join' 메뉴를 선택했을 때 새 사용자 정보를 입력받도록 하고. 보조 메뉴를 다음과 같이 출력한다.
        ```
        [새 사용자 입력]
        아이디: java
        이름 : 김자바
        비밀번호: 12345
        나이 : 26
        이메일 : java@mycompany.com

        -------------------------------------------------------------------
        보조메뉴: 1.Ok | 2.Cancel
        메뉴선택: 2
        ```

        3. User 클래스를 선언하고, 입력된 새 사용자 정보를 User 객체에 저장한다.

        4. 보조 메뉴에서 '1.Ok'를 선택하면 새 사용자는 데이터베이스 users 데이블에 저장된다.
        성공적으로 가입되면 다시 목록으로 되돌아온다.

        5. 보조 메뉴에서 '2.Cancel'을 선택하면 새 사용자 정보를 무시하고 다시 목록으로 되돌아온다.
     */
    // 콘솔 게시판 앱 메뉴
    // 필드
    private Scanner scanner = new Scanner(System.in);
    private Connection conn;

    // 생성자
    public Ex05() {
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
        System.out.println("메인메뉴: 1. Create | 2. Read | 3. Clear | 4.Join | 5. Exit");
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
                join();
                break;
            case 5:
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
        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("정말 삭제하시겠습니까?");
        System.out.println("보조메뉴: 1. Ok, 2. Cancel");
        System.out.println("-------------------------------------------");
        System.out.println("메뉴선택: ");
        String subMenuNo = scanner.nextLine();
        if (subMenuNo.equals("1")) {
            String sql = "DELETE FROM boards WHERE boardNo = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                pstmt.setInt(1, board.getBoardNo());
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
    }
    private void clear() {
        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("모든 게시글을 삭제합니다. 정말 삭제하시겠습니까?");
        System.out.println("보조메뉴: 1. Ok, 2. Cancel");
        System.out.println("-------------------------------------------");
        System.out.println("메뉴선택: ");
        String subMenuNo = scanner.nextLine();
        if (subMenuNo.equals("1")) {
            String sql = "TRUNCATE TABLE boards";
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
        list();
    }
    private void join() {
        System.out.println("[새 사용자 입력]");
        scanner.nextLine(); // buffer
        System.out.println("아이디: ");
        String userId = scanner.nextLine();
        System.out.println("이름: ");
        String userName = scanner.nextLine();
        System.out.println("비밀번호: ");
        String password = scanner.nextLine();
        System.out.println("나이: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("이메일: ");
        String email = scanner.nextLine();

        User user = new User(userId, userName, password, age, email);

        // 보조 메뉴 출력
        System.out.println("-------------------------------------------");
        System.out.println("보조메뉴: 1. Ok, 2. Cancel");
        System.out.println("-------------------------------------------");
        System.out.println("메뉴선택: ");
        String subMenuNo = scanner.nextLine();

        if (subMenuNo.equals("1")) {
            String sql = "INSERT INTO boards (userId, userName, password, age, email) VALUES (?, ?, ?, ?, ?)";
            // 객체에서 핑드를 가져와 동적 sql 문 완성
            try (PreparedStatement pstmt = conn.prepareStatement(sql);){
                pstmt.setString(1, user.getUserId());
                pstmt.setString(2, user.getUserName());
                pstmt.setString(3, user.getPassword());
                pstmt.setInt(4, user.getAge());
                pstmt.setString(5, user.getEmail());

                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
                exit();
            }
        }
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
        Board08 board = new Board08();
        board.list();
        board.mainMenu();
    }

}
