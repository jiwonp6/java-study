package ch27_stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex9 {
    /*
        <도서관 책 대여 기록 분석>
        도서관의 책 대여 기록이 있습니다.
        각 대여 기록에는 사용자 ID와 대여한 책의 수량이 포함되어 있습니다.
        전체 대여된 책의 수량을 계산하세요.
        대여 기록이 가장 많은 사용자의 ID를 찾으세요.

        출력예시
        ===
        전체 대여된 책의 수량: 11
        가장 많은 책을 대여한 사용자: user2
     */
    public static void main(String[] args) {
        List<BookRental> rentals = Arrays.asList(
            new BookRental("user1", 3),
            new BookRental("user2", 5),
            new BookRental("user3", 1),
            new BookRental("user4", 2)
        );

        // 전체 대여된 책의 수량을 계산하세요.
        int sum = rentals.stream()
                                .mapToInt(BookRental::quantity)
                                .sum();
        System.out.println("전체 대여된 책의 수량: " + sum);

        // 대여 기록이 가장 많은 사용자의 ID를 찾으세요.
        // 1.
        // 최대 대여 기록 찾기
        int max = rentals.stream()
                .mapToInt(BookRental::quantity)
                .max()
                .getAsInt();
        // System.out.println("max = " + max);
        // 최대 대여 기록의 사용자 ID 찾기
        rentals.stream()
                .filter(bookRental -> bookRental.quantity() == max)
                .map(BookRental::userId)
                .map(id -> "1. 가장 많은 책을 대여한 사용자: " + id)
                .forEach(System.out::println);

        // 2.
        Optional<BookRental> max2 = rentals.stream()
                                            .max(Comparator.comparing(BookRental::quantity));
        System.out.println("2. 가장 많은 책을 대여한 사용자: " + max2.get().userId());

        // 3. Optional 의 map은 변환된 Optional을 반환함
        String maxUser = rentals.stream()
                                .max(Comparator.comparing(BookRental::quantity))
                                .map(bookRental -> bookRental.userId())
                                .orElse("찾지 못했습니다.");
        System.out.println("3. 가장 많은 책을 대여한 사용자: " + maxUser);

    }
}
record BookRental(String userId, int quantity) {}

