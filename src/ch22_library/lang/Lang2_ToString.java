package ch22_library.lang;

public class Lang2_ToString {
    public static void main(String[] args) {
        Product product1 = new Product("바나나", 5000, "과일");
        System.out.println(product1);
    }
}

class Product{
    private String productName;
    private long price;
    private String category;

    public Product(String productName, long price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    // 마법사를 통해 필드 데이터 쉽게 생성 가능
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
