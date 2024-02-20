package ch08_class.ex3;
// #9 연습문제 (2024-02-16)
public class ProductOrderMain {
    public static void main(String[] args) {
        // 변수설정
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "노트북";
        productOrder1.price = 1000000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "마우스";
        productOrder2.price = 15000;
        productOrder2.quantity = 3;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "키보드";
        productOrder3.price = 50000;
        productOrder3.quantity = 1;

        // 배열 생성 후 값 넣어주기
        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3};

        // 합계계산
        int totPrice = 0;
        for (int i = 0; i < productOrders.length; i++) {
            totPrice += (productOrders[i].price * productOrders[i].quantity);
        }

        // 출력
        System.out.println("<주문 상품 정보>");
        for (ProductOrder po : productOrders){
            System.out.printf("상품명 : %s\t 가격 : %d원\t 수량 : %d개\n", po.productName, po.price, po.quantity);
        }
        System.out.println("--------------------------------------------------");
        System.out.println("총 결제 금액 : " + totPrice + "원");
    }
}
