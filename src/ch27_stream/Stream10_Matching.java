package ch27_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream10_Matching {
    // 스트림 요소를 만족하는지 여부 확인 : Matching
    // 최종연산
    // 리턴 -> boolean
    // 람다식 Predicate
    // allMatch : 모든 요소가 만족되면 true
    // anyMatch : 하나라도 만족되면 true
    // noneMatch : 모든 요소가 만족하지 않으면 true
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        boolean allPositive = numberList.stream()
                                        .allMatch(num -> num > 0);      // 최종연산 -> return boolean 값

        System.out.println("모든 수가 양수입니까? : " + allPositive);

        // 스트림은 최종연산을 한 번 수행하고 나면 더 이상 사용할 수 없다. (1회성)
        Stream<Integer> numberStream = numberList.stream();
        boolean b1 = numberStream.allMatch(num -> num > 0);
        // boolean b2 = numberStream.anyMatch(num -> num > 0);

        // anyMatch
        boolean hasEven = numberList.stream()
                                    .anyMatch(num -> num % 2 == 0);// 짝수 존재 여부
        System.out.println("짝수가 하나라도 존재하나요? : " + hasEven);

        // noneMatch
        boolean greaterThan5 = numberList.stream()
                                        .noneMatch(num -> num > 5);     // 5를 초과하는 것이 없는지
        System.out.println("5를 초과하는 수가 없나요? : " + greaterThan5);

        // 문자열 리스트의 유효성 검증시
        List<String> fruits = Arrays.asList("사과", "바나나", "배", "");
        boolean allNotEmpty = fruits.stream()
                                .allMatch(fruit -> !fruit.isEmpty());
        System.out.println("모든 문자열이 빈 문자열이 아닌가요? : " + allNotEmpty);

        // 특정 조건을 만족하는 스트림 요소의 부재를 확인
        List<String> usernames = Arrays.asList("user1", "user2", "user3", "admin");
        boolean noAdmin = usernames.stream()
                                .noneMatch("admin"::equals);
        System.out.println("admin이라는 사용자가 없나요? : " + noAdmin);

        // 할인 적용 대상 찾기, 비싼 가격 찾기 로직 등
        List<Product> products = new ArrayList<>(
                List.of(new Product("노트북", 1200.99),
                        new Product("아이폰", 999.99),
                        new Product("패드", 200.00)
                )
        );

        boolean isAllExpensive = products.stream()
                                        .allMatch(product -> product.price >= 300.00);
        System.out.println("모든 물건이 $300 이상인가요? : " + isAllExpensive);

    }
    record Product(String name, double price) { }

}
