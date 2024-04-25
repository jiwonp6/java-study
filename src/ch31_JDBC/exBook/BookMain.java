package ch31_JDBC.exBook;

import java.util.List;
import java.util.Scanner;

public class BookMain {
    private static BookDao bookDao;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        bookDao = new BookDaoImpl(DatabaseUtil.getConnection());
        while(true) {
            System.out.println("[도서 관리 시스템] 1. 도서 추가 | 2. 도서 삭제 | 3. 도서 수정 | 4. 도서 조회 | 5. 종료");
            System.out.println("메뉴선택: ");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1" -> insert();
                case "2" -> delete();
                case "3" -> update();
                case "4" -> search();
                case "5" -> {
                    DatabaseUtil.close();
                    System.out.println("시스템을 종료합니다.");
                    return;
                }

            }
        }
    }

    private static void insert() {
        System.out.println("[도서 추가]");
        System.out.print("ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("출판년도 입력: ");
        int publish_year = Integer.parseInt(scanner.nextLine());
        System.out.print("장르 입력: ");
        String genre = scanner.nextLine();
        BookDto book = new BookDto(isbn, title, author, publish_year, genre);
        bookDao.insert(book);
    }
    private static void delete() {
        System.out.println("[도서 삭제]");
        System.out.print("삭제할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        bookDao.delete(isbn);
    }
    private static void update() {
        System.out.println("[도서 수정]");
        System.out.print("수정할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        System.out.print("새 제목 입력: ");
        String title = scanner.nextLine();
        System.out.print("새 저자 입력: ");
        String author = scanner.nextLine();
        System.out.print("새 출판년도 입력: ");
        int publish_year = Integer.parseInt(scanner.nextLine());
        System.out.print("새 장르 입력: ");
        String genre = scanner.nextLine();
        BookDto book = new BookDto(isbn, title, author, publish_year, genre);
        bookDao.update(book);
    }
    private static void search() {
        System.out.println("1. 모든 도서 목록 조회 | 2. ISBN 으로 검색 | 3. 저자나 제목으로 검색");
        String searchNo = scanner.nextLine();
        switch (searchNo) {
            case "1" -> allBooks();
            case "2" -> searhByIsbn();
            case "3" -> searchByTitleOrAuthor();

        }
    }
    private static void allBooks() {
        System.out.println("[도서 목록]");
        List<BookDto> books = bookDao.lookUpBooks();
        for (BookDto book : books) {
            System.out.printf("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s\n",
                    book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublish_year(), book.getGenre());
        }
    }
    private static void searhByIsbn() {
        System.out.println("[도서 검색]");
        System.out.print("검색할 도서의 ISBN 입력: ");
        String isbn = scanner.nextLine();
        BookDto book = bookDao.getBookByIsbn(isbn);
        System.out.printf("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s\n",
                book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublish_year(), book.getGenre());
    }
    private static void searchByTitleOrAuthor() {
        System.out.println("[도서 검색]");
        System.out.print("검색할 도서의 제목이나 저자 입력: ");
        String search = scanner.nextLine();
        List<BookDto> books = bookDao.getBookByTitleOrAuthor(search);
        for (BookDto book : books) {
            System.out.printf("ISBN: %s, 제목: %s, 저자: %s, 출판년도: %d, 장르: %s\n",
                    book.getIsbn(), book.getTitle(), book.getAuthor(), book.getPublish_year(), book.getGenre());
        }
    }

}
