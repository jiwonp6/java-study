package ch22_library.lang.lang2_toString;

public class Product{
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
