package ch31_JDBC.board;

public class Board01 {
    // 콘솔 게시판 앱 메뉴
    public  void list() {
        System.out.println("[게시물 목록]");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "hkd", "2024-04-23", "안녕하세요");

    }

    public void mainMenu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("메인메뉴: 1. Create | 2. Read | 3. Clear | 4. Exit");
        System.out.println("메뉴선택: ");
    }

    public static void main(String[] args) {
        Board01 board = new Board01();
        board.list();
        board.mainMenu();
    }
}
