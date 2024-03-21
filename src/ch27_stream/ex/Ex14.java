package ch27_stream.ex;

import java.util.*;
import java.util.stream.Collectors;

public class Ex14 {
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
        
        출력예시
        ===
        1. 모든 책의 평균 페이지 수 계산
        2. 특정 장르 책의 평균 출판년도 계산
        3. 특정 연도 이후 출판된, 최소 페이지 이상 책의 제목 출력
        4. 각 장르별 책의 수 계산
        5. 가장 많은 책이 출판된 장르 찾기
        0. 종료
        실행할 작업을 선택하세요: 1
        모든 책의 평균 페이지 수: 547 페이지
        
        실행할 작업을 선택하세요: 2
        평균 출판년도를 계산할 장르를 입력하세요: 소설
        [소설] 장르 책의 평균 출판년도: 1885 년
        
        실행할 작업을 선택하세요: 3
        조회할 최소 연도를 입력하세요: 2010
        조회할 최소 페이지 수를 입력하세요: 300
        2010년 이후 출판되고 300페이지 이상인 책의 제목들: [Java의 정석, Effective Java]
        
        실행할 작업을 선택하세요: 4
        각 장르별 책의 수: {소설=2, 연극=1, 컴퓨터 과학=3}
        
        실행할 작업을 선택하세요: 5
        가장 많은 책이 출판된 장르: 컴퓨터 과학
        
        실행할 작업을 선택하세요: 0
        프로그램을 종료합니다.
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
                                "0. 종료\n");
            System.out.println("실행할 작업을 선택하세요: ");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    // 모든 책의 평균 페이지 수를 계산하세요.
                    double average = books.stream()
                            .mapToInt(Book::pages)
                            .average()
                            .orElse(Double.NaN);
                    System.out.printf("모든 책의 평균 페이지 수: %.0f 페이지\n", average);
                    break;

                case 2:
                    scanner.nextLine();     // 개행 비워주기
                    // 장르가 "소설"인 책들만 추려서, 이들의 평균 출판년도를 계산하세요.
                    System.out.println("평균 출판년도를 계산할 장르를 입력하세요:");
                    String selectedGenre = scanner.nextLine();

                    Map<String, Double> avgPublishYearByGenre
                            = books.stream()
                                    .collect(Collectors.groupingBy(Book::genre, Collectors.averagingDouble(Book::publishYear)));
                    avgPublishYearByGenre.entrySet().stream()
                                                    .filter(entry -> entry.getKey().equals(selectedGenre))
                            .forEach(selectedBook -> System.out.printf("[%s] 장르 책의 평균 출판년도: %d년\n",
                                                        selectedBook.getKey(), selectedBook.getValue().intValue()));
                    break;
                case 3:
                    // 2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목들을 출력하세요.
                    System.out.println("조회할 최소 연도를 입력하세요: ");
                    int selectedYear = scanner.nextInt();
                    System.out.println("조회할 최소 페이지 수를 입력하세요: ");
                    int selectedPageNum = scanner.nextInt();

                    System.out.printf("%s년 이후 출판되고 %s페이지 이상인 책의 제목들: ", selectedYear, selectedPageNum);
                    books.stream()
                            .filter(book -> book.publishYear >= selectedYear)
                            .filter(book -> book.pages >= selectedPageNum)
                            .forEach(
                                    book -> System.out.print(book.title + "\t")
                            );
                    System.out.println("");
                    break;
                case 4:
                    // 각 장르별로 책이 몇 권씩 있는지 계산하세요.
                    Map<String, Long> numOfBookByGenre = books.stream()
                            .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));
                    System.out.println("각 장르별 책의 수: " + numOfBookByGenre);
                    break;
                case 5:
                    Map<String, Long> base = books.stream()
                            .collect(Collectors.groupingBy(Book::genre, Collectors.counting()));
                    int max = books.stream()
                            .collect(Collectors.groupingBy(Book::genre,
                                    Collectors.counting())).values().stream()
                            .mapToInt(Long::intValue)
                            .max()
                            .getAsInt();
                    // 가장 많은 책이 출판된 장르를 찾으세요.
                    String s = base.entrySet().stream()
                            .max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey)
                            .orElse("잘못된 장르");
                    System.out.println("가장 많은 책이 출판된 장르: " + s);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
    public record Book(String title, String genre, String author, int publishYear, int pages) {}
}
