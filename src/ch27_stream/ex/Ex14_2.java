package ch27_stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14_2 {
    /*
        <도서관 책 관리 시스템>
        도서관에는 여러 장르의 책들이 있으며, 
        각 책은 제목, 장르, 저자, 출판년도, 페이지 수 정보를 가지고 있습니다. 
        책 정보를 관리하고, 특정 조건에 맞는 책들을 찾아내는 작업이 필요합니다.
        
        [요구사항]
        - 모든 책의 평균 페이지 수를 계산하세요.
        - 장르가 "소설"인 책들만 추려서, 이들의 평균 출판년도를 계산하세요.
        - 2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목들을 출력하세요.
        - 각 장르별로 책이 몇 권씩 있는지 계산하세요.
        - 가장 많은 책이 출판된 장르를 찾으세요.
        - 책 제목이나 작가의 키워드로 책 검색이 가능하게 하세요.
     */
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

        Scanner scanner = new Scanner(System.in);
        int num = -1;

        while (num != 0) {
            System.out.println("\n" +
                                "1. 모든 책의 평균 페이지 수 계산\n" +
                                "2. 특정 장르 책의 평균 출판년도 계산\n" +
                                "3. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력\n" +
                                "4. 각 장르별 책의 수 계산\n" +
                                "5. 가장 많은 책이 출판된 장르 찾기\n" +
                                "6. 책 검색하기\n" +
                                "0. 종료\n");
            System.out.println("실행할 작업을 선택하세요: ");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    q1(books);
                    break;

                case 2:
                    System.out.print("장르를 입력하세요 ");
                    // (enter)<한줄
                    String genre = scanner.nextLine();
                    q2(books, genre);
                    break;
                case 3:
                    System.out.print("조회할 최소 연도를 입력하세요 ");
                    int year = scanner.nextInt();
                    System.out.print("조회할 최소 페이지 수를 입력하세요 ");
                    int page = scanner.nextInt();
                    q3(books, year, page);
                    break;
                case 4:
                    q4(books);
                    break;
                case 5:
                    q5(books);
                    break;
                case 6:
                    scanner.nextLine();     // 버퍼
                    System.out.println("검색할 키워드(작가 또는 책 제목)를 입력해주세요.");
                    String query = scanner.nextLine();
                    q6(books, query);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
    // 실행 메소드
    private static void q1(List<Book> books) {
        double avgBookPage = books.stream().mapToInt(Book::pages).average().orElse(0.0);
        System.out.printf("모든 책의 평균 페이지 수 = %.0f 페이지\n",avgBookPage);
    }
    private static void q2(List<Book> books, String genre) {
        Double novelAvgYear = books.stream().filter(book -> book.genre.equals(genre))
                .collect(Collectors.averagingInt(Book::publishYear));
        System.out.printf("장르가 \"%s\"인 책들의 평균 출판년도 = %.0f \n", genre,  novelAvgYear);
    }
    private static void q3(List<Book> books, int year, int page) {
        List<String> titleList = books.stream()
                .filter(book ->
                        book.publishYear > year
                                && book.pages >= page)
                .map(Book::title)
                .collect(Collectors.toList());
        System.out.printf("%d년 이후에 출판된 책들 중 페이지 수가 %d페이지 이상인 책의 제목 = %s\n", year, page, titleList);
    }

    private static Map<String, Long> q4(List<Book> books) {
        Map<String, Long> genreBookMap = books.stream()
                .collect(Collectors.groupingBy(Book::genre,
                        Collectors.counting()));
        System.out.println("각 장르별로 책의 수 = " + genreBookMap);
        return genreBookMap;
    }

    private static void q5(List<Book> books) {
        Map<String, Long> genreBookMap = books.stream()
                .collect(Collectors.groupingBy(Book::genre,
                        Collectors.counting()));
        String maxGenre = genreBookMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("잘못된 장르");
        System.out.println("가장 많은 책이 출판된 장르 = " + maxGenre);
    }

    private static void q6(List<Book> books, String query) {
        List<Book> list = books.stream().
                filter(book -> book.title.toLowerCase().contains(query.toLowerCase())       // 책의 이름과 저자로 검색
                        || book.author.toLowerCase().contains(query.toLowerCase()))
                .toList();
        list.forEach(
                selectedLists -> System.out.println("책 제목 : " + selectedLists.title
                                                    + ", 장르 : " + selectedLists.genre
                                                    + ", 작가 : " + selectedLists.author
                                                    + ", 출판년도 : " + selectedLists.publishYear
                                                    + ", 페이지수 : " + selectedLists.pages)
        );      // 검색된 책의 목록 출력
    }
    public record Book(String title, String genre, String author, int publishYear, int pages) {}
}
