package ch31_JDBC.board;

import java.util.Scanner;

public class Board02 {
    // 콘솔 게시판 앱 메뉴
    Scanner scanner = new Scanner(System.in);
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
        System.out.println("board02.exit");
    }

    public static void main(String[] args) {
        Board02 board = new Board02();
        board.list();
        board.mainMenu();
    }
}
