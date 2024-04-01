package quiz.quiz6.q5;

import java.util.Arrays;
import java.util.List;

public class Quiz05 {
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );

        double average = reviews.stream()
                                .mapToInt(ProductReview::getReviewScore)
                                .average()
                                .orElse(Double.NaN);
        System.out.println("평균 리뷰 점수: " + average);

        long count = reviews.stream()
                            .filter(productReview -> productReview.getReviewScore() == 5)
                            .count();
        System.out.println("5점 리뷰 수: " + count);

    }

    static class ProductReview {
        private String productName;
        private int reviewScore;

        public ProductReview(String productName, int amount) {
            this.productName = productName;
            this.reviewScore = amount;
        }

        public String getProductName() {
            return productName;
        }

        public int getReviewScore() {
            return reviewScore;
        }
    }
}
