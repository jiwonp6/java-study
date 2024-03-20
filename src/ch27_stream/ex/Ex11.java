package ch27_stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex11 {
    /*
        <제품 리뷰 분석>
        온라인 상점에서 판매되는 여러 제품에 대한 리뷰 점수가 있습니다.
        각 리뷰에는 제품 ID와 리뷰 점수(1~5)가 포함되어 있습니다.

        - 전체 제품에 대한 평균 리뷰 점수를 계산하세요.
        - 리뷰 점수가 5점인 리뷰의 수를 계산하세요.

        출력예시
        ===
        평균 리뷰 점수: 4.2
        5점 리뷰 수: 2
     */
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
            new ProductReview("product1", 5),
            new ProductReview("product2", 4),
            new ProductReview("product3", 5),
            new ProductReview("product4", 3),
            new ProductReview("product1", 4)
        );
        // 전체 제품에 대한 평균 리뷰 점수를 계산하세요.
        Double average = reviews.stream()
                                .mapToInt(ProductReview::score)
                                .average()
                                .orElse(Double.NaN);
        System.out.println("평균 리뷰 점수: " + average);

        // 리뷰 점수가 5점인 리뷰의 수를 계산하세요.
        long count = reviews.stream()
                            .mapToInt(ProductReview::score)
                            .filter(score -> score == 5)
                            .count();
        System.out.println("5점 리뷰 수: " + count);

    }
}
record ProductReview(String productName, int score) {}
