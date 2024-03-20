package ch27_stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex06 {
    /*
        <상품 가격과 리뷰 정렬>
        온라인 상점의 상품들의 리스트가 있습니다.
        각 상품은 이름, 가격, 리뷰 수를 가지고 있습니다.
        우선 상품을 리뷰 수가 많은 순으로 정렬하세요.
        만약 리뷰 수가 같다면, 가격이 낮은 순으로 정렬하세요.

        출력예시
        ===
        Tablet - $199.99, Reviews: 300
        Smartphone - $499.99, Reviews: 300
        Laptop - $999.99, Reviews: 250
        Smartwatch - $199.99, Reviews: 150
     */
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, 250),
                new Product("Smartphone", 499.99, 300),
                new Product("Tablet", 199.99, 300),
                new Product("Smartwatch", 199.99, 150)
        );

        products.stream()
                .sorted(Comparator.comparing(Product::getReviews)
                                  .reversed()
                                  .thenComparing(Product::getPrice))
                .forEach(System.out::println);

    }
}
    class Product {
        String name;
        double price;
        int reviews;

        Product(String name, double price, int reviews) {
            this.name = name;
            this.price = price;
            this.reviews = reviews;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getReviews() {
            return reviews;
        }

        @Override
        public String toString() {
            return name + " - $" + price + ", Reviews: " + reviews;
        }
    }
