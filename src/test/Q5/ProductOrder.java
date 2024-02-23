package test.Q5;

public class ProductOrder {
    // 필드
    String productName;
    int price;
    int quantity;
    int sum = 0;

    // 생성자
    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // 메소드
    int getTotPayment(){
        sum = price * quantity;
        return sum;
    }
    void printOrder(){
        System.out.printf("상품명 : %s, 가격 : %s, 수량 : %s\n", productName, price, quantity);
    }
}
