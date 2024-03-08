package quiz.quiz3.q5;

import java.util.Objects;

public class Product {
    // 필드
    private String name;
    private double price;
    private int quantity;

    // 생성자
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    // toString
    @Override
    public String toString() {
        return "상품 : " + name + ", 가격 : " + price + ", 수량 : " + quantity;
    }
}
